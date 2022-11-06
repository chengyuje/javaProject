package Dao.member;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.member;

public class implMember implements memberDao {
	
	public static void main(String[] args) {
		/*member m=new member("asd","asd111","111","新北","880","221");
		new implDao().add(m);
		member m1=new member("qwe","qwe562","562","台南","950","6521");
		new implDao().add(m1);
		member m2=new member("kdj","kdj663","663","屏東","895","661");
		new implDao().add(m2);
		member m3=new member("oqi","oqi552","552","台東","332","2661");
		new implDao().add(m3);*/
		
		/*List<member> list=new implDao().queryAll();
		for(member m:list) {
			System.out.println(m.getName());
		}*/
		//System.out.println(new implDao().queryMember("abc13", "123"));
		//System.out.println(new implDao().queryUsername("abc12"));
		//System.out.println(new implDao().queryMember(0));
		member m=new implMember().queryMember(3);
		m.setName("Mark");
		m.setMobile("654123");
		new implMember().update(m);
		//new implDao().delete(5);
	}

	@Override
	public void add(member m) {
		EntityManager em=DbConnection.getDB();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<member> queryAll() {
		EntityManager em=DbConnection.getDB();
		String jpql="select m from member m";
		Query q=em.createQuery(jpql);
		List<member> list=q.getResultList();
		return list;
	}


	@Override
	public member queryMember(String username, String password) {
		EntityManager em=DbConnection.getDB();
		String jpql="select m from member m where m.username=?1 and m.password=?2";
		Query q=em.createQuery(jpql);
		q.setParameter(1,username);
		q.setParameter(2,password);
		List<member> list=q.getResultList();
		member[] m=list.toArray(new member[list.size()]);
		if(m.length!=0)
			return m[0];
		else
			return null;
	}


	@Override
	public boolean queryUsername(String name) {
		EntityManager em=DbConnection.getDB();
		String jpql="select m from member m where m.username=?1";
		Query q=em.createQuery(jpql);
		q.setParameter(1,name);
		List<member> list=q.getResultList();
		boolean x=false;
		if(list.size()!=0) {
			x=true;
			return x;
		}else {
			 
			return false;
		}
			
	}


	@Override
	public member queryMember(int id) {
		EntityManager em=DbConnection.getDB();
		String jpql="select m from member m where m.id=?1";
		Query q=em.createQuery(jpql);
		q.setParameter(1,id);
		List<member> list=q.getResultList();
		member[] m=list.toArray(new member[list.size()]);
		if(m.length!=0)
			return m[0];
		else
			return null;
	}


	@Override
	public void update(member m) {
		EntityManager em=DbConnection.getDB();
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		em.close();
		
	}


	@Override
	public void delete(int id) {
		EntityManager em=DbConnection.getDB();
		member m=em.find(member.class,id);
		em.getTransaction().begin();
		em.remove(m);
		em.getTransaction().commit();
		em.close();
	}

}
