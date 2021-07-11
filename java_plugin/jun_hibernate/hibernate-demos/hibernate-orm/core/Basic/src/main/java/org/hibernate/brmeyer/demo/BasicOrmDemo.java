/* 
 * Hibernate, Relational Persistence for Idiomatic Java
 * 
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.hibernate.brmeyer.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.brmeyer.demo.entity.Comment;
import org.hibernate.brmeyer.demo.entity.Community;
import org.hibernate.brmeyer.demo.entity.Donation;
import org.hibernate.brmeyer.demo.entity.Project;
import org.hibernate.brmeyer.demo.entity.ServiceEvent;
import org.hibernate.brmeyer.demo.entity.Skill;
import org.hibernate.brmeyer.demo.entity.Tool;
import org.hibernate.brmeyer.demo.entity.User;
import org.hibernate.cfg.Configuration;

/**
 * The Class BasicOrmDemo.
 *
 * @author Brett Meyer
 */
public class BasicOrmDemo {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			Tool tool = new Tool();
			// Note: id generated by Hibernate
			tool.setName( "Hammer" );
			insertTool( tool );
			List<Tool> tools = new ArrayList<Tool>();
			tools.add( tool );
			
			Skill skill = new Skill();
			// Note: id generated by Hibernate
			skill.setName( "Hammering Things" );
			insertSkill( skill );
			List<Skill> skills = new ArrayList<Skill>();
			skills.add( skill );
			
			User user = new User();
			// Note: id generated by Hibernate
			user.setName( "Brett Meyer" );
			user.setEmail( "foo@foo.com" );
			user.setPhone( "123-456-7890" );
			user.setTools( tools );
			user.setSkills( skills );
			
			insertUser( user );
			
			user = getUser( user.getId() );
			System.out.println( user.toString() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	/**
	 * Insert user.
	 *
	 * @param user the user
	 * @throws Exception the exception
	 */
	private static void insertUser(User user) throws Exception {
		Session session = openSession();
		session.getTransaction().begin();
		session.persist( user ); // cascades the tool & skill relationships
		session.getTransaction().commit();
	}
	
	/**
	 * Insert tool.
	 *
	 * @param tool the tool
	 * @throws SQLException the SQL exception
	 */
	private static void insertTool(Tool tool) throws SQLException {
		Session session = openSession();
		session.getTransaction().begin();
		session.persist( tool );
		session.getTransaction().commit();
	}
	
	/**
	 * Insert skill.
	 *
	 * @param skill the skill
	 * @throws SQLException the SQL exception
	 */
	private static void insertSkill(Skill skill) throws SQLException {
		Session session = openSession();
		session.getTransaction().begin();
		session.persist( skill );
		session.getTransaction().commit();
	}
	
	/**
	 * Gets the user.
	 *
	 * @param id the id
	 * @return the user
	 * @throws SQLException the SQL exception
	 */
	private static User getUser(int id) throws SQLException {
		Session session = openSession();
		
		User user = (User) session.get( User.class, id );
		
//		Query query = session.createQuery( "SELECT u FROM User u WHERE u.id=:id" );
//		query.setParameter( "id", id );
//		User user = (User) query.uniqueResult();
		
//		User user = (User) session.createCriteria( User.class )
//				.add( Restrictions.eq( "id", id ) )
//				.uniqueResult();
		
		Hibernate.initialize( user.getTools() );
		Hibernate.initialize( user.getSkills() );
		
		session.close();
		
		return user;
	}
	
	/** The session factory. */
	private static SessionFactory sessionFactory = null;
	
	/**
	 * Open session.
	 *
	 * @return the session
	 */
	private static Session openSession() {
		if (sessionFactory == null) {
			final Configuration configuration = new Configuration();
			configuration.addAnnotatedClass( User.class );
			configuration.addAnnotatedClass( Tool.class );
			configuration.addAnnotatedClass( Skill.class );
			configuration.addAnnotatedClass( Community.class );
			configuration.addAnnotatedClass( Donation.class );
			configuration.addAnnotatedClass( Comment.class );
			configuration.addAnnotatedClass( ServiceEvent.class );
			configuration.addAnnotatedClass( Project.class );
			
			sessionFactory = configuration.buildSessionFactory( new StandardServiceRegistryBuilder().build() );
		}
		return sessionFactory.openSession();
	}
}
