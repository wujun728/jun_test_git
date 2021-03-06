package io.gitee.tooleek.lock.spring.boot.service.impl;

import io.gitee.tooleek.lock.spring.boot.core.LockKey;
import io.gitee.tooleek.lock.spring.boot.exception.LockFailException;
import io.gitee.tooleek.lock.spring.boot.service.LockService;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 读锁操作服务
 * @author Wujun
 *
 */
public class ReadLockServiceImpl implements LockService {

	@Qualifier("lockRedissonClient")
	@Autowired
	private RedissonClient lockRedissonClient;
	
	private LockKey lockKey;
	
	private RLock lock;
	
	@Override
	public void setLockKey(LockKey lockKey) {
		this.lockKey=lockKey;
	}

	@Override
	public void lock() throws Exception {
		
		this.lock = lockRedissonClient.getReadWriteLock(lockKey.getKeyList().get(0)).readLock();
		
		if(lockKey.getLeaseTime()==-1&&lockKey.getWaitTime()==-1) {
			lock.lock();
			return;
		}
		if(lockKey.getLeaseTime()!=-1&&lockKey.getWaitTime()==-1) {
			lock.lock(lockKey.getLeaseTime(),lockKey.getTimeUnit());
			return;
		}
		if(lockKey.getLeaseTime()!=-1&&lockKey.getWaitTime()!=-1) {
			boolean isLock = lock.tryLock(lockKey.getWaitTime(),lockKey.getLeaseTime(),lockKey.getTimeUnit());
			if(!isLock) {
				throw new LockFailException("加锁失败");
			}
			return;
		}
		
		this.lock.lock();
	}

	@Override
	public void release() {
		//this.lock.unlock();
		this.lock.forceUnlock();
	}

}
