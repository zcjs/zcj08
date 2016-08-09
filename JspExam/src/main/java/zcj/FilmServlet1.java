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


public class FilmServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FilmServlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmDaoImpl  fdi = new FilmDaoImpl();
		String type = request.getParameter("type");
		/*try {
			//显示
			ArrayList<Film> list = fdi.getAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/film.jsp").forward(request, response);
			//System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		} */
			if(type.equals("add"))
			{
			FilmDaoImpl fdi1 = new FilmDaoImpl();
			Film film = new Film();
			String Title = request.getParameter("Title");
			String Description = request.getParameter("Description");
			int Language_id =  (Integer.parseInt(request.getParameter("Language_id")));
			film.setTitle(Title);
			film.setDescription(Description);
			film.setLanguage(Language_id);
			
			try {
				fdi1.insert(film);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("/FilmServlet2").forward(request, response);
			}
			else if(type.equals("delete"))
			{
				FilmDaoImpl fdi2 = new FilmDaoImpl();
				int film_id=Integer.parseInt(request.getParameter("Film_id"));
				try {
					fdi2.delete(film_id);
				}catch (SQLException e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("/FilmServlet2").forward(request, response);
			}
		
			/*//删除
			if(type.equals("delete"))
			{
				int film_id=Integer.parseInt(request.getParameter("Film_id"));
				try {
					fdi.delete(film_id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}*/
		
		
	}

}
