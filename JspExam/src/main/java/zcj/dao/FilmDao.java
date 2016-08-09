package zcj.dao;

import java.sql.SQLException;
import java.util.List;
import zcj.enity.Film;

public interface FilmDao {
	void insert(Film film) throws SQLException;
	void delete(int film_id) throws SQLException;
	List<Film> getAll() throws SQLException;
    
}
