package com.pdp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pdp.dto.PhotoDto;
import com.pdp.helper.AlbumServiceFactory;
import com.pdp.service.AlbumService;
import com.pdp.service.AlbumServiceImpl;

@WebServlet(urlPatterns = "/browse")
public class BrowseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AlbumService albumService = null;
		PhotoDto photoDto = null;
		String action = null;
		int cPhotoNo = 0;
		int albumNo = 0;
		int firstPhotoNo = 0;
		int lastPhotoNo = 0;

		albumService = AlbumServiceFactory.getAlbumService();
		action = req.getParameter("action");
		albumNo = Integer.parseInt(req.getParameter("album"));
		try {
			firstPhotoNo = albumService.getFirstPhotoNo(albumNo);
			lastPhotoNo = albumService.getLastPhotoNo(albumNo);

			if (action.equals("album")) {
				photoDto = albumService.getFirstPhoto(albumNo);
			} else if (action.equals("next")) {
				cPhotoNo = Integer.parseInt(req.getParameter("cPhotoNo"));
				photoDto = albumService.getNextPhoto(albumNo, cPhotoNo);
			} else if (action.equals("prev")) {
				cPhotoNo = Integer.parseInt(req.getParameter("cPhotoNo"));
				photoDto = albumService.getPrevPhoto(albumNo, cPhotoNo);
			}

			req.setAttribute("firstPhotoNo", firstPhotoNo);
			req.setAttribute("lastPhotoNo", lastPhotoNo);
			req.setAttribute("photo", photoDto);
			req.setAttribute("albumNo", albumNo);
			req.getRequestDispatcher("/albums.jsp").forward(req, resp);
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

}
