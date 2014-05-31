package com.ucap.ucapmetamodel;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.ucap.ucapmetamodel.example.Parent;
import com.ucap.ucapmetamodel.example.SingleTable;
import com.ucap.ucapmetamodel.example.Son;

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
public class One2OneQueryTest {
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
	public void testInsert(){
		try {
			entityManager.getTransaction().begin();
			Parent parent = new Parent();
			parent.setName("父");
			Son son = new Son();
			son.setName("子");
			parent.setSon(son);
			//son.setParent(parent);
			
			entityManager.persist(parent);
			entityManager.flush();
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testQuery1() {
		try {
			System.out.println(entityManager);
			List<Parent> singleTables = entityManager.createQuery("select s from Parent s", Parent.class).getResultList();
			System.out.println(singleTables.get(1).getSon());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQuery2() {


		List<Object[]> t1list = entityManager.createNativeQuery(" select t.sid,max(t.sname) from T1 t group by t.sid").getResultList();
		List<BigDecimal> t3listy = entityManager.createNativeQuery(" select nvl(tt1.t3count,'0') t3ounty from ((select t3.sid, count(t3.sid) t3count from T3 t3 where t3.bsstatus='1' group by t3.sid)) tt1,( select t.sid from T1 t group by t.sid) tt  where tt1.sid(+) = tt.sid order by tt.sid asc").getResultList();
		List<BigDecimal> t3listn = entityManager.createNativeQuery(" select nvl(tt1.t3count,'0') t3ounty from ((select t3.sid, count(t3.sid) t3count from T3 t3 where t3.bsstatus='3' group by t3.sid)) tt1,( select t.sid from T1 t group by t.sid) tt  where tt1.sid(+) = tt.sid order by tt.sid asc").getResultList();
		for(int i = 0; i < t1list.size(); i++){
			System.out.println(t1list.get(i)[0]+"-"+t1list.get(i)[1]+"-"+t3listy.get(i)+"-"+t3listn.get(i));
		}
	}

}
