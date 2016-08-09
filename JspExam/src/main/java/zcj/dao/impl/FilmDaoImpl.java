package zcj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import zcj.dao.FilmDao;
import zcj.enity.Film;
import zcj.util.DbUtil;

public class FilmDaoImpl implements FilmDao{

	public void insert(Film film) throws SQLException {
		Connection conn=DbUtil.getConnection();
		String sql="insert into film(title,description,language_id) values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, film.getTitle());
		ps.setString(2, film.getDescription());
		ps.setInt(3, film.getLanguage());
		ps.executeUpdate();
		DbUtil.close(null,ps,conn);
	}

	public void delete(int film_id) throws SQLException {
		Connection conn=DbUtil.getConnection();
		String sql="delete from film where film_id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, film_id);
		ps.executeUpdate();
		DbUtil.close(null,ps,conn);
	}

	public ArrayList<Film> getAll() throws SQLException {
		Connection conn=DbUtil.getConnection();
		String sql="select f.film_id, f.title, f.description, f.language_id from film f";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		ArrayList<Film> fs=new ArrayList<Film>();
		while(rs.next()){
			Film f=new Film();
			f.setFilm_id(rs.getInt("film_id"));
			f.setTitle(rs.getString("title"));
			f.setDescription(rs.getString("description"));
			f.setLanguage(rs.getInt("language_id"));
			fs.add(f);
	}
		DbUtil.close(rs,ps,conn);
		return fs;
	
}}
