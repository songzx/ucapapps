package com.ucap.ucapmetamodel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.ucap.ucapmetamodel.example.SingleTable;

/**
 * 生成元模型命令(jdk1.6+):javac -classpath path/to/openjpa-all.jar
 * -Aopenjpa.metamodel=true mypackage/MyEntity.java 注：该命令生成的代码在该运行命令行的目录下
 * 
 * 使用元模型,则使用语句:Root<User>.get(User_.displayname).
 * 否则使用语句:Root<User>.get(entityType
 * .getSingularAttribute("displayname",String.class)
 * 
 * @author ACER
 * 
 */
public class Many2ManyQueryTest {
	private EntityManager entityManager;
	private EntityManagerFactory entityManagerFactory;

	@Before
	public void init() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("authorityunit");
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	@Test
	public void testQuery1() {
		try {
			System.out.println(entityManager);
			List<SingleTable> singleTables = entityManager.createQuery("select s from Manys1 s", SingleTable.class).getResultList();
			System.out.println(singleTables.size());
			for(SingleTable tmp : singleTables){
				System.out.println(tmp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
