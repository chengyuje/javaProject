package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	//create
	void add(member m);
	
	//read
	List<member> queryAll();
	member queryMember(String username,String password);
	boolean queryUsername(String name);
	member queryMember(int id);
	
	//update
	void update(member m);
	
	//delete
	void delete(int id);
	
}
