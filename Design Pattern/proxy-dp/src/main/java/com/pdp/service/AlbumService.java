package com.pdp.service;

import java.sql.SQLException;
import java.util.List;

import com.pdp.dto.AlbumDto;
import com.pdp.dto.PhotoDto;

public interface AlbumService {
	public List<AlbumDto> getAlbums() throws SQLException;

	public int getNoOfPhotos(int albumNo) throws SQLException;

	public PhotoDto getFirstPhoto(int albumNo) throws SQLException;

	public PhotoDto getNextPhoto(int albumNo, int cPhotoNo) throws SQLException;

	public PhotoDto getPrevPhoto(int albumNo, int cPhotoNo) throws SQLException;

	public byte[] getPhoto(int photoNo) throws SQLException;

	public int getFirstPhotoNo(int albumNo) throws SQLException;

	public int getLastPhotoNo(int albumNo) throws SQLException;
}
