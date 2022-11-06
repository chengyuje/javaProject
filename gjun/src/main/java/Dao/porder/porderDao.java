package Dao.porder;

import java.util.List;

import Model.porder;

public interface porderDao {
	
	void add(porder p);
	
	List<porder> queryAll();
	List<porder> querySum(int start,int end);
	porder queryPorder(int i);
	
	void update(porder p);
	
	void delete(int id);
}
