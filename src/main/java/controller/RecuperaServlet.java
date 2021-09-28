package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet("/recupera.do")
public class RecuperaServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException
	{
		ArrayList<Usuario> db = new ArrayList<Usuario>();
		
		Usuario usuario1 = new Usuario(1, "Greta Blue", "greta@gmail.com");
		Usuario usuario2 = new Usuario(2, "Raymond Reddington", "raymond@gmail.com");
		Usuario usuario3 = new Usuario(3, "Nicolau Copérnico", "copernico@gmail.com");
		Usuario usuario4 = new Usuario(4, "Ada Lovelace", "ada@gmail.com");
		
		db.add(usuario1);
		db.add(usuario2);
		db.add(usuario3);
		db.add(usuario4);
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Usuario result = null;
		for(Usuario user : db) 
		{
			if(user.getId() == id) 
			{
				result = user;
				break;
			}
		}
		
		String paginaDestino = "";
		
		if(result != null)
		{
			request.setAttribute("Usuario", result);
			paginaDestino = "/info.jsp";
		}
		else 
		{
			paginaDestino = "/erro.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}
}
