package com.pdp.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pdp.helper.AlbumServiceFactory;
import com.pdp.service.AlbumService;
import com.pdp.service.AlbumServiceImpl;

@WebServlet(urlPatterns = { "/photo" })
public class PhotoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int photoNo = 0;
		String mediaType = null;
		byte[] photoContent = null;
		OutputStream out = null;
		AlbumService albumService = null;

		try {
			out = resp.getOutputStream();
			albumService = AlbumServiceFactory.getAlbumService();
			photoNo = Integer.parseInt(req.getParameter("photoNo"));
			mediaType = req.getParameter("mediaType");

			photoContent = albumService.getPhoto(photoNo);
			resp.setHeader("Content-Type", mediaType);
			resp.setHeader("Content-Disposition", "inline");
			out.write(photoContent);
			out.close();
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

}
