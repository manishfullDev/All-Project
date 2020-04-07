package com.pdp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pdp.bo.AlbumBo;
import com.pdp.bo.PhotoBo;
import com.pdp.helper.ConnectionManager;

public class AlbumDao {
	private final String SQL_GET_ALBUMS = "select album_no, description from album order by album_no";
	private final String SQL_GET_FIRST_PHOTO_IN_ALBUM = "select photo_no, caption, photo_media_type from photo where photo_no = (select min(photo_no) from photo where album_no = ?)";
	private final String SQL_COUNT_PHOTOS_IN_ALBUM = "select count(1) from photo where album_no = ?";
	private final String SQL_GET_NEXT_PHOTO_IN_ALBUM = "select photo_no, caption, photo_media_type from photo where photo_no = (select min(p.photo_no) from photo p where p.photo_no > ? and p.album_no=?)";
	private final String SQL_GET_PREV_PHOTO_IN_ALBUM = "select photo_no, caption, photo_media_type from photo where photo_no = (select max(p.photo_no) from photo p where p.photo_no < ? and p.album_no=?)";
	private final String SQL_GET_LAST_PHOTO_NO_IN_ALBUM = "select max(photo_no) from photo where album_no = ?";
	private final String SQL_GET_FIRST_PHOTO_NO_IN_ALBUM = "select min(photo_no) from photo where album_no = ?";
	private final String SQL_GET_PHOTO = "select photo_content from photo where photo_no = ?";

	public List<AlbumBo> getAlbums() throws SQLException {
		ConnectionManager connectionManager = null;
		List<AlbumBo> albums = null;

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL_GET_ALBUMS);
			albums = new ArrayList<AlbumBo>();
			while (rs.next()) {
				albums.add(new AlbumBo(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return albums;
	}

	public int getNoOfPhotos(int albumNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int noOfPhoto = 0;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_COUNT_PHOTOS_IN_ALBUM);
			pstmt.setInt(1, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				noOfPhoto = rs.getInt(1);
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return noOfPhoto;
	}

	public PhotoBo getFirstPhoto(int albumNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PhotoBo photoBo = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_FIRST_PHOTO_IN_ALBUM);
			pstmt.setInt(1, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoBo = new PhotoBo(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoBo;
	}

	public PhotoBo getNextPhoto(int albumNo, int cPhotoNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PhotoBo photoBo = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_NEXT_PHOTO_IN_ALBUM);
			pstmt.setInt(1, cPhotoNo);
			pstmt.setInt(2, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoBo = new PhotoBo(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoBo;
	}

	public PhotoBo getPrevPhoto(int albumNo, int cPhotoNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PhotoBo photoBo = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_PREV_PHOTO_IN_ALBUM);
			pstmt.setInt(1, cPhotoNo);
			pstmt.setInt(2, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoBo = new PhotoBo(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoBo;
	}

	public byte[] getPhoto(int photoNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		byte[] photoContent = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_PHOTO);
			pstmt.setInt(1, photoNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoContent = rs.getBytes(1);
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoContent;
	}

	public int getLastPhotoNo(int albumNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int photoNo = 0;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_LAST_PHOTO_NO_IN_ALBUM);
			pstmt.setInt(1, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoNo = rs.getInt(1);
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoNo;
	}

	public int getFirstPhotoNo(int albumNo) throws SQLException {
		ConnectionManager connectionManager = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int photoNo = 0;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			pstmt = con.prepareStatement(SQL_GET_FIRST_PHOTO_NO_IN_ALBUM);
			pstmt.setInt(1, albumNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				photoNo = rs.getInt(1);
			}
		} catch (SQLException e) {

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return photoNo;
	}

}
