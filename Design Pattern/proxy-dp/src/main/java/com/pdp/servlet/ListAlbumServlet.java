package com.pdp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pdp.dto.AlbumDto;
import com.pdp.helper.AlbumServiceFactory;
import com.pdp.service.AlbumService;
import com.pdp.service.AlbumServiceImpl;

@WebServlet(urlPatterns = "/albums")
public class ListAlbumServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<AlbumDto> albumDtos = null;
		AlbumService albumService = null;
		HttpSession httpSession = null;

		try {
			albumService = AlbumServiceFactory.getAlbumService();
			albumDtos = albumService.getAlbums();
			httpSession = req.getSession();

			httpSession.setAttribute("albums", albumDtos);
			req.getRequestDispatcher("/albums.jsp").forward(req, resp);
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

}
