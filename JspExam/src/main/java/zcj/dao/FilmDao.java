package zcj.dao;

import java.util.List;

import zcj.enity.Film;

public interface FilmDao {
	
    int insert(Film film);
   
    int delete(int id);
    
    List<Film> getAll();
}
