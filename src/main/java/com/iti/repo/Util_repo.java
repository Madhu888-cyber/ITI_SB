package com.iti.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.iti.entity.Ssc_boards;

@Repository
public class Util_repo {
	
	@PersistenceContext private EntityManager entityManager;
	
	String url="jdbc:postgresql://localhost:5432/itisb";
	String username="postgres";
	String password="123";
	
	public List<Ssc_boards> list(){
		 List<Ssc_boards> list = new ArrayList<>();
		 try {
			 Connection connection = DriverManager.getConnection(url, username, password);
			 String sql = "select * from admissions.ssc_examboard_mst order by board_name";
			 Statement statement = connection.createStatement();
			 ResultSet result = statement.executeQuery(sql);
			 
			 while(result.next()) {
				 String board_code = result.getString("board_code");
				 String board_name = result.getString("board_name");
				 
				 Ssc_boards ssc_boards = new Ssc_boards(board_code, board_name);
				 list.add(ssc_boards);
			 }
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		return list;
	}
	
	public List<Ssc_boards> newlist(){
		List<Ssc_boards> newlist = new ArrayList<>();
		List<Object[]> list= entityManager.createQuery("select * from admissions.ssc_examboard_mst order by board_name").getResultList();
		for(Object[] lists :list) {
			String board_code = (String) lists[0];
			String board_name = (String) lists[1];
			
			Ssc_boards boards = new Ssc_boards(board_code, board_name);
			newlist.add(boards);
		}
		return newlist;
	}
	
	public int ifApplicantExists(int regid) {
		
		
		return 0;
	}
 
}
