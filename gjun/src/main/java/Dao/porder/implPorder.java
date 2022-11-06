package Dao.porder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.porder;

public class implPorder implements porderDao {

	public static void main(String[] args) {
//		porder p=new porder("D桌",2,2,8);
//		new implPorder().add(p);
		//System.out.println(new implPorder().queryAll());
		/*porder p=new implPorder().queryPorder(2);
		p.setA(4);
		p.getSum();
		new implPorder().update(p);*/
		new implPorder().querySum(200,1000);
	}

	@Override
	public void add(porder p) {
		EntityManager em=DbConnection.getDB();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<porder> queryAll() {
		EntityManager em=DbConnection.getDB();
		String jpql="select p from porder p";
		Query q=em.createQuery(jpql);
		List<porder> list=q.getResultList();
		
		return list;
	}

	@Override
	public List<porder> querySum(int start, int end) {
		EntityManager em=DbConnection.getDB();
		String jpql="select p from porder p where p.sum>=?1 and p.sum<=?2";
		Query q=em.createQuery(jpql);
		q.setParameter(1,start);
		q.setParameter(2,end);
		List<porder> list=q.getResultList();	
		return list;
	}

	@Override
	public void update(porder p) {
		EntityManager em=DbConnection.getDB();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void delete(int id) {
		EntityManager em=DbConnection.getDB();
		porder p=em.find(porder.class,id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public porder queryPorder(int i) {
		EntityManager em=DbConnection.getDB();
		String jpql="select p from porder p where p.id=?1";
		Query q=em.createQuery(jpql);
		q.setParameter(1,i);
		List<porder> list=q.getResultList();
		porder[] p=list.toArray(new porder[list.size()]);
		if(p.length!=0)
			return p[0];
		else
			return null;
	}

}
