### `jun_plugin` 项目

### [俊哥个人技术栈代码库(持续更新)](https://github.com/wujun728)

### 项目说明
jun_plugin 整合Java企业级各种开发组件、开箱即用、不写重复代码，包含基础Java基础开发组件，Spring企业家开发组，SpringBoot开发组件、SpringCloud开发组件

### 功能清单

1. Java常用开发组件：**java_plugin**，Java常用开发组件，当前包含47类各种lib类库示例与文档。
2. Spring常用开发组件：**spring_plugin**，企业级开发常用组件，当前集成61中类种lib类库示例与文档。
3. SpringBoot常用开发组件：**springboot_plugin**，企业级开发常用组件，当前集成106中类种lib类库示例与文档。
4. Maven常用项目模板：**maven_template**，当前集成了6种项目开发模板，含maven单体分布式、SSH、SSM、Boot、Cloud等。
5. SpringCloud常用开发组件：**springcloud_plugin**，含netflix、alibaba、dubbo、quarkus等，主要为示例与文档。


#### 基础篇：企业级开发组件(开发组件、代码生成、前端组件) [jun_java_plugin]

> Java基础系开发组件-通用篇（jun_plugin） 常用开发组件，基础公共lib包的组件不依赖Spring的组件，主要供原生开发的项目集成：

- 【jun_activiti】[流程引擎，Activiti工作流，完成工作流常用操作](https://github.com/wujun728/jun_plugin/jun_activiti)
- 【jun_ajax】[完成ajax操作，前端及后端的ajax](https://github.com/wujun728/jun_plugin)
- 【jun_aliyun_sms】[短信工具,集成阿里云短信、腾讯云短信发送及验证码等功能](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_aliyun_sms)
- 【jun_apache_commons】[ Common工具集,集成Apache通用工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_apache_commons)
- 【jun_api】[ API中心,API注册测试校验管控鉴权中心](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_api)
- 【jun_cron】 [cron表达式的java的实现及调度](https://github.com/wujun728/jun_plugin)
- 【jun_cache】[分布式缓存，缓存工具,集成Redis分布式缓存功能](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_cache)
- 【jun_camel】[消息路由，ESB服务总线,EIP框架，处理不同系统之间的消息传输](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_camel)
- 【jun_captcha】[ 验证码工具,GoogleKaptcha及各种验证码工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_captcha)
- 【jun_crawler】[ 爬虫引擎,网络爬虫引擎，Xpath解析HTML](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_crawler)
- 【jun_datasource_cluster】[原生集成各种JDBC DataSource数据源,分布式数据源,Druid、DBCP等数据源](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_datasource_cluster)
- 【jun_dbutil】[原生集成Apache 的Dbutils完成单表及多表的增删改查，原生JDBC操作，简单封装](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_dbutil)
- 【jun_demo】[ DEMO测试,DEMO测试工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_demo)
- 【jun_designpattern】[23种涉及模式的Java实现](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_designpattern)
- 【jun_drools】[ 规则引擎,规则引擎的各种demo及工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_drools)
- 【jun_dubbo】[ Dubbo,阿里巴巴Dubbo RPC demo及工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_dubbo)
- 【jun_executor】[原生的并发多线程demo操作](https://github.com/wujun728/jun_plugin)
- 【jun_email】[原生邮件发送、纯文本、HTML邮件、带附件的邮件](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_email)
- 【jun_excel】[ Excel工具集,Excel导入导出工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_excel)
- 【jun_fileupload】[原生的文件上传及下载操作的实现基于common fileupload，OSS上传下载](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_fileupload)
- 【jun_freemarker】[原生集成freemarker模板引擎，数据+模板=输出，可输出代码生成器](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_freemarker)
- 【jun_guava】[ GoogleGuava,谷歌工具集，集合工具，缓存工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_guava)
- 【jun_guice】[ GoogleGuice,谷歌依赖注入框架(配合Servlet3.0+Dbutil)](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_guice)
- 【jun_gzip】[ Gzip压缩,Gzip压缩及解压缩](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_gzip)
- 【jun_hibernate】[原生集成hibernate及使用,Hibernate,JPA框架，持久化框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_hibernate)
- 【jun_httpclient】[原生集成httpclient，发送http请求、下载文件等，配合Postman发起各种HTTP请求](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_httpclient)
- 【jun_image】[原生图片操作包、包括图片上传、下载、展示、转码、压缩转Base64、缩略图等](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_image)
- 【jun_jdk】[JDK原生demo代码，了解的越多才会了解的越深](https://github.com/wujun728/jun_plugin)
- 【jun_jdbc】[原生JDBC操作，简单封装，需要的可以看下](https://github.com/wujun728/jun_plugin)
- 【jun_j2cache】[ 缓存j2cache,缓存工具，OSCHACHE使用的缓存工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_j2cache)
- 【jun_jar2maven】[ Jar转Maven,Jar转Maven工具集，老web项目转maven项目](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_jar2maven)
- 【jun_jbpm】[ 流程引擎JBPM,流程引擎JBPM，老牌流程引擎](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_jbpm)
- 【jun_jdk】[ JDK核心,JDK核心工具，常用Demo等](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_jdk)
- 【jun_jsoup】[HTM标记语言解析包，完成HTML解析、主要爬虫使用，解析HTML渲染数据](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_jsoup)
- 【jun_lucene】[老牌搜索引擎、可以看下,搜索框架,搜索框架，全文检索工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_lucene)
- 【jun_leetcode】[算法刷题大全](https://github.com/wujun728/jun_plugin)
- 【jun_mybatisplus】[ MybatisPlus,MybatisPlus数据持久化映射框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_mybatisplus)
- 【jun_pay】[ 支付工具,支付工具，集成微信及阿里支付](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_pay)
- 【jun_pdf】[ PDF工具,PDF工具，生成PDF及PDF文件](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_pdf)
- 【jun_poi】[原生POI完成Excel文件的导入、解析、导出及持久化等](https://github.com/wujun728/jun_plugin)
- 【jun_qrcode】[二维码生成器,二维码生成工具，WEB二维码服务](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_qrcode)
- 【jun_quartz】[job任务调度,任务调度框架，分布式任务调度](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_quartz)
- 【jun_redis】[ Redis缓存,Redis缓存，分布式缓存，分布式锁](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_redis)
- 【jun_rpc】[原生RPC调用、客户端及服务端](https://github.com/wujun728/jun_plugin)
- 【jun_restlet】[REST工具，轻量级REST框架,不依赖Servlet的REST的工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_restlet)
- 【jun_serializable】[ 序列化,序列化与反序列化工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_serializable_json_protobuf_kyro_hessian)
- 【jun_shiro】[ 认证与鉴权,认证与鉴权，URL过滤，用户任务，角色功能鉴权](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_shiro)
- 【jun_sso】[原生SSO的实现单点登录,SSO单点登录工具，提供单点登录服务](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_sso)
- 【jun_servlet】[原生Servlet、WEB开发的基础](https://github.com/wujun728/jun_plugin)
- 【jun_templatespider】[ 模板爬虫,模板爬虫工具，直接下载url到html文件](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_templatespider)
- 【jun_test】[JUNIT框架及TestNG框架](https://github.com/wujun728/jun_plugin)
- 【jun_util】[开发工具util，常用开发工具集、非常重要！！！](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_util)
- 【jun_webmagic】[ 爬虫引擎Webmagic,爬虫引擎Webmagic，爬取整个网站](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_webmagic)
- 【jun_webservice】[原生的webservice调用、基于apache cxf实现服务调用及发布,CXF，Axis等](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_webservice)
- 【jun_webservlet】[原生Servlet 3.0的实现,Servlet3.0新特性demo，原生注解Servlet](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_webservlet)
- 【jun_websocket】[原生的WebSocket的实现长链接,Websocket长链接demo，消息推送及异步工具](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_websocket)
- 【jun_xml】[原生的XML解析及生产XML、提供SAX、DOM、DOM4J解析生成XML](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/jun_xml)

 

> Spring系企业级开发框架组件 Spring常用开发组件，万能粘合剂，企业级J2EE实际标准平台
 【jun_distributed_session】[分布式Session实现及配置持久化等](https://github.com/wujun728/jun_plugin)
【Spring消息队列】[spring_activemq Activemq消息队列,Spring集成activemq消息队列工具集demo](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_activemq)
【Spring分布式事务】[spring_atomikos 分布式事务atomikos,分布式事务atomikos](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_atomikos)
【Spring消息路由】[spring_camel 消息路由camel,消息路由camel](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_camel)
【Spring单点登录】[spring_cas 单点登录cas,单点登录cas](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_cas)
【Spring跨域调用】[spring_cors Spring跨域调用,Spring跨域调用](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_cors)
【Spring测试DEMO】[spring_demo Spring测试DEMO,Spring测试DEMO](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_demo)
【Spring分布式配置】[spring_distributed_config Spring分布式配置,Spring分布式配置](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_config)
【Spring分布式文件】[spring_distributed_fastdfs Spring分布式文件,Spring分布式文件](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_fastdfs)
【Spring分布式锁】[spring_distributed_lock Spring分布式锁,Spring分布式锁](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_lock)
【Spring分布式数据源】[spring_distributed_multidatasource Spring分布式数据源,Spring分布式数据源](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_multidatasource)
【Spring分布式Netty服务】[spring_distributed_netty Spring分布式Netty服务,Spring分布式Netty服务](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_netty)
【Spring分布式对象存储】[spring_distributed_oss_qiniu Spring分布式对象存储,Spring分布式对象存储](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_oss_qiniu)
【Spring分布式RPC框架】[spring_distributed_rpc Spring分布式RPC框架,Spring分布式RPC框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_rpc)
【Spring分布式Session】[spring_distributed_session Spring分布式Session,Spring分布式Session](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_session)
【Spring分布式事务TCC】[spring_distributed_transaction_tcc Spring分布式事务TCC,Spring分布式事务TCC](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_distributed_transaction_tcc)
【Spring集成规则引擎】[spring_drools Spring集成规则引擎,Spring集成规则引擎](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_drools)
【Spring集成Dubbo框架】[spring_dubbo Spring集成Dubbo框架,Spring集成Dubbo框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_dubbo)
【Spring集成任务调度】[spring_dynamic_job Spring集成任务调度,Spring集成任务调度](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_dynamic_job)
【Spring集成Excel工具集】[spring_easyexcel Spring集成Excel工具集,Spring集成Excel工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_easyexcel)
【Spring集成ES搜索框架】[spring_elasticsearch Spring集成ES搜索框架,Spring集成ES搜索框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_elasticsearch)
【Spring集成邮件】[spring_email Spring集成邮件,Spring集成邮件](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_email)
【Excel工具集】[spring_excel Excel工具集,Excel工具集](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_excel)
【Spring集成Hibernate】[spring_hibernate Spring集成Hibernate,Spring集成Hibernate](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_hibernate)
【Spring集成校验框架】[spring_hibernate_validator Spring集成校验框架,Spring集成校验框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_hibernate_validator)
【Spring集成JPA框架】[spring_jpa Spring集成JPA框架,Spring集成JPA框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_jpa)
【Spring集成jqgrid增删改查】[spring_jqgrid Spring集成jqgrid增删改查,Spring集成jqgrid增删改查](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_jqgrid)
【Spring集成JSONP前端跨域】[spring_jsonp Spring集成JSONP前端跨域,Spring集成JSONP前端跨域](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_jsonp)
【JSOP解析HTML】[spring_jsoup JSOP解析HTML,JSOP解析HTML](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_jsoup)
【Spring集成JWT认证】[spring_jwt Spring集成JWT认证,Spring集成JWT认证](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_jwt)
【Spring集成Kafka消息队列】[spring_kafka Spring集成Kafka消息队列,Spring集成Kafka消息队列](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_kafka)
【Spring集成Lucene】[spring_lucene Spring集成Lucene,Spring集成Lucene](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_lucene)
【Spring集成Mina】[spring_mina Spring集成Mina,Spring集成Mina](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_mina)
【Spring集成MongoDB增删改查】[spring_mongodb Spring集成MongoDB增删改查,Spring集成MongoDB增删改查](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_mongodb)
【Spring集成Mybatis】[spring_mybatis Spring集成Mybatis,Spring集成Mybatis](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_mybatis)
【Spring集成Netty】[spring_netty Spring集成Netty,Spring集成Netty](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_netty)
【Spring集成Nutch】[spring_nutch Spring集成Nutch,Spring集成Nutch](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_nutch)
【Spring集成Oauth鉴权】[spring_oauth Spring集成Oauth鉴权,Spring集成Oauth鉴权](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_oauth)
【Spring集成Quartz】[spring_quartz Spring集成Quartz,Spring集成Quartz](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_quartz)
【Spring集成Rabbitmq消息队列】[spring_rabbitmq Spring集成Rabbitmq消息队列,Spring集成Rabbitmq消息队列](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_rabbitmq)
【Spring集成Redis缓存】[spring_redis Spring集成Redis缓存,Spring集成Redis缓存](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_redis)
【SSH框架】[spring_s2sh SSH框架,SSH框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_s2sh)
【Spring集成Shiro与Redis】[spring_shiro_redis Spring集成Shiro与Redis,Spring集成Shiro与Redis](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_shiro_redis)
【Spring集成Solr服务】[spring_solr Spring集成Solr服务,Spring集成Solr服务](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_solr)
【SpringBatch批量服务】[spring_springbatch SpringBatch批量服务,SpringBatch批量服务](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_springbatch)
【SpringJDBC】[spring_springjdbc SpringJDBC,SpringJDBC](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_springjdbc)
【SpringMVC】[spring_springmvc SpringMVC,SpringMVC](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_springmvc)
【SSH框架】[spring_ssh SSH框架,SSH框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssh)
【SSH2框架】[spring_ssh2 SSH2框架,SSH2框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssh2)
【SSM集成dubbo】[spring_ssm_dubbo SSM集成dubbo,SSM集成dubbo](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssm_dubbo)
【SSM集成Freemarker】[spring_ssm_freemarker SSM集成Freemarker,SSM集成Freemarker](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssm_freemarker)
【SSM集成layui】[spring_ssm_layui SSM集成layui,SSM集成layui](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssm_layui)
【SSM框架】[spring_ssm2 SSM框架,SSM框架](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_ssm2)
【Spring集成Struts2】[spring_struts2 Spring集成Struts2,Spring集成Struts2](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_struts2)
【Spring集成Swagger】[spring_swagger Spring集成Swagger,Spring集成Swagger](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_swagger)
【SpringTask】[spring_task SpringTask,SpringTask](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_task)
【Spring集成thymeleaf模板】[spring_thymeleaf Spring集成thymeleaf模板,Spring集成thymeleaf模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_thymeleaf)
【Spring集成velocity模板】[spring_velocity Spring集成velocity模板,Spring集成velocity模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_velocity)
【Spring集成webmagic爬虫】[spring_webmagic Spring集成webmagic爬虫,Spring集成webmagic爬虫](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_webmagic)
【Spring集成Websocket】[spring_websocket Spring集成Websocket,Spring集成Websocket](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/spring_websocket)
【Shiro权限控制】 [Spring整合Apache Shiro框架，实现用户管理和权限控制](https://github.com/wujun728/jun_spring_plugin/Spring-shiro)
【Spring security权限控制】 [使用Spring security做权限控制](https://github.com/wujun728/jun_spring_plugin/spring-security-demo)
【Quartz定时JOB】[SpringTask 使用Spring security做权限控制](https://github.com/wujun728/jun_spring_plugin/spring-security-demo)
【Lucence搜索】[SpringTask 使用Spring security做权限控制](https://github.com/wujun728/jun_spring_plugin/spring-security-demo)
【ActiveMQ消息队列】[Spring平台整合消息队列ActiveMQ实现发布订阅、生产者消费者模型（JMS）](https://github.com/wujun728/jun_spring_plugin/Spring-activeMQ)
【RabbitMQ消息队列】[Spring整合消息队列RabbitMQ实现四种消息模式（AMQP）](https://github.com/wujun728/jun_spring_plugin/Spring-rabbitMQ)
【Websocket协议】[Spring整合websocket实现即时通讯](https://github.com/wujun728/jun_spring_plugin/Spring-websocket)
【Elastic search全文检索】[Spring整合Elastic search实现全文检索](https://github.com/wujun728/jun_spring_plugin/Spring-elastic_search)
【单点登录】[Spring整合CAS框架&JWT实现单点登录](https://github.com/wujun728/jun_spring_plugin/Spring-cas-sso)


> SpringBoot系开发框架组件，基于SpringBoot微服务开发组件，新企业级REST服务

【Java代码生成模块】[数据库表代码生成、页面代码生成](https://github.com/wujun728/jun_code_generator/jun_code_helper)
【Mybatis代码生成模块】[Mybatis代码生成](https://github.com/wujun728/jun_code_generator)
【MybatisPlus代码生成模块】[Mybatis-Plus代码生成](https://github.com/wujun728/jun_code_generator)
【Maven项目模板】常用项目开发模板，新增SSH、SSM、Boot、Cloud、Android、APP模板


> Maven常用项目模板，含maven单体分布式、SSH、SSM、Boot、Cloud等

【Java单体项目模板】[maven_javaproject\ Java单体项目模板,Java单体项目模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/maven_javaproject\)
【Spring4多模块项目模板】[maven_spring4_multi_modules\ Spring4多模块项目模板,Spring4多模块项目模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/maven_spring4_multi_modules\)
【Spring5多模块项目模板】[maven_spring5_multi_modules\ Spring5多模块项目模板,Spring5多模块项目模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/maven_spring5_multi_modules\)
【Spring5微服务项目模板】[maven_spring5template\ Spring5微服务项目模板,Spring5微服务项目模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/maven_spring5template\)
【SpringBoot微服务项目模板】[maven_springboot_permission_example\ SpringBoot微服务项目模板,SpringBoot微服务项目模板](https://github.com/wujun728/jun_java_plugin/tree/master/spring_plugin/maven_springboot_permission_example\)

 

<!--=CONCATENATE("【",D33,"】","[",E33,"",B33,",",F33,"]","(">https://github.com/wujun728/jun_java_plugin/tree/master/java_plugin/",B33,")")-->




#### 工程截图(组件较多，随意择选了几个)

<table>
    <tr>
		<td><img src="https://raw.githubusercontent.com/lerry903/RuoYi/master/img/oper_log.jpg"/>
		<td><img src="https://raw.githubusercontent.com/lerry903/RuoYi/master/img/login_log.jpg"/>
    </tr>
</table>


#### 开发环境
- **JDK 1.8 
- **Maven 3.5 
- **IDEA 2018.2 + or  STS 4.5 +** (*注意：安装lombok插件）

#### `笔者其他项目`  
- jun_ssh_parent：[点击查看](https://github.com/wujun728/jun_ssh_parent) 
- jun_ssm_parent：[点击查看](https://github.com/wujun728/jun_ssm_parent) 


springboot_actuator
springboot_admin
springboot_async
springboot_batch
springboot_bootshiro
springboot_cache
springboot_codegen
springboot_data_jpa
springboot_data_mybatis
springboot_demo
springboot_distributed_seckill
springboot_docker
springboot_drools
springboot_dubbo
springboot_dynamic_datasource
springboot_elastic_job
springboot_email
springboot_exception_handler
springboot_fastdfs
springboot_flyway
springboot_freemarker
springboot_graylog
springboot_helloworld
springboot_hibernate_validator
springboot_https
springboot_jackson
springboot_jbpm6
springboot_jms
springboot_jpa_jsp
springboot_jsp
springboot_junit
springboot_jwt
springboot_kafka
springboot_kaptcha
springboot_kisso
springboot_ldap
springboot_lhbauth
springboot_lock
springboot_lock4j
springboot_log
springboot_log_aop
springboot_logback
springboot_mongodb
springboot_mq_kafka
springboot_mq_rabbitmq
springboot_mq_rocketmq
springboot_multi_datasource_jpa
springboot_multi_datasource_mybatis
springboot_mybatis
springboot_mybatis_jsp
springboot_neo4j
springboot_oauth
springboot_oauth_server
springboot_oauth2_server
springboot_order_mybaits_activemq
springboot_orm_beetlsql
springboot_orm_jdbctemplate
springboot_orm_jpa
springboot_orm_mybatis
springboot_orm_mybatis_mapper_page
springboot_orm_mybatis_plus
springboot_pay
springboot_properties
springboot_ratelimit_guava
springboot_ratelimit_redis
springboot_rbac_security
springboot_rbac_shiro
springboot_redis
springboot_redis_sentinel
springboot_redislock
springboot_redisson
springboot_redisson_starter
springboot_restful
springboot_session
springboot_sharding_jdbc
springboot_sharding_jdbc_mybatis_plus
springboot_shiro_jwt
springboot_social
springboot_springside4
springboot_swagger
springboot_swagger_beauty
springboot_task
springboot_task_quartz
springboot_task_xxl_job
springboot_template_beetl
springboot_template_enjoy
springboot_template_freemarker
springboot_template_thymeleaf
springboot_templatemaven
springboot_templates_layui_admin
springboot_tio
springboot_tools
springboot_transaction
springboot_uflo
springboot_uniapp
springboot_upload
springboot_ureport2
springboot_urule
springboot_war
springboot_webflux_reactive_rest_api
springboot_webhook
springboot_websocket
springboot_websocket_demo
springboot_websocket_socketio
springboot_wm_accesstoken
springboot_zookeeper