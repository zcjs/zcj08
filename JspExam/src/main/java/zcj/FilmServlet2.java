package zcj;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcj.dao.impl.FilmDaoImpl;
import zcj.enity.Film;


public class FilmServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmDaoImpl  fdi = new FilmDaoImpl();
		try {
			//显示
			ArrayList<Film> list = fdi.getAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/film.jsp").forward(request, response);
			//System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
