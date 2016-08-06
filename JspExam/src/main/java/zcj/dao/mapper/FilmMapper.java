package zcj.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import zcj.enity.Film;
import zcj.util.ObjectMapper;

public class FilmMapper implements ObjectMapper{
	  public Object mapObject(ResultSet rs)
	        throws SQLException
	    {
	        Film b = new Film();
	        b.setFilm_id(rs.getInt("fid"));
	        b.setTitle(rs.getString("titlt"));
	        b.setDescription(rs.getString("description"));
	        b.setLanguage(rs.getString("flanguage"));
	      
	        return b;
}}
