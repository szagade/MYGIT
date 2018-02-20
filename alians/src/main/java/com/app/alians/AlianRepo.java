package com.app.alians;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javassist.bytecode.stackmap.BasicBlock.Catch;


public class AlianRepo {

	Connection con=null;
	
	
	public AlianRepo() {
		
		String url="jdbc:mysql://localhost:3306/restdb";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Alian> getAlians() {

		List <Alian> alians=new ArrayList<>();
		String sql="select * from alian";
		try {
			Statement st=con.createStatement();
			ResultSet rs =st.executeQuery(sql);
			
			while(rs.next()) {
				Alian a=new Alian();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				alians.add(a);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return alians;
	} 
	
	
	public Alian getAlian(int id) {
		Alian alian=new Alian();
		String sql="select * from alian where id="+id;
		try {
			Statement st=con.createStatement();
			ResultSet rs =st.executeQuery(sql);
			if(rs.next()) {
				alian.setId(rs.getInt(1));
				alian.setName(rs.getString(2));
				alian.setPoints(rs.getInt(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return alian;

	}
	
	public void create(Alian a1) {
			
		String sql="insert into alian values(?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, a1.getId());
			ps.setString(2, a1.getName());
			ps.setInt(3, a1.getPoints());	
			ps.executeUpdate();
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	
	}

	public void update(Alian a) {
		// TODO Auto-generated method stub
		String sql="update alian set name=?, points=? where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, a.getName());
			ps.setInt(2, a.getPoints());
			ps.setInt(3, a.getId());

			ps.executeUpdate();
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from alian where id=?";
		AlianRepo a=new AlianRepo();
		try {
			if(a.getAlian(id)!=null) {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				ps.executeUpdate();
	
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
	
	
}
