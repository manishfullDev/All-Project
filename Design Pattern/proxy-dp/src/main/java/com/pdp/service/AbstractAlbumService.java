package com.pdp.service;

import java.sql.SQLException;
import java.util.List;

import com.pdp.dto.AlbumDto;
import com.pdp.dto.PhotoDto;

abstract public class AbstractAlbumService implements AlbumService {
	private AlbumService albumService;

	public AbstractAlbumService(AlbumService albumService) {
		this.albumService = albumService;
	}

	@Override
	public List<AlbumDto> getAlbums() throws SQLException {
		return albumService.getAlbums();
	}

	@Override
	public int getNoOfPhotos(int albumNo) throws SQLException {
		return albumService.getNoOfPhotos(albumNo);
	}

	@Override
	public PhotoDto getFirstPhoto(int albumNo) throws SQLException {
		return albumService.getFirstPhoto(albumNo);
	}

	@Override
	public PhotoDto getNextPhoto(int albumNo, int cPhotoNo) throws SQLException {
		return albumService.getNextPhoto(albumNo, cPhotoNo);
	}

	@Override
	public PhotoDto getPrevPhoto(int albumNo, int cPhotoNo) throws SQLException {
		return albumService.getPrevPhoto(albumNo, cPhotoNo);
	}

	@Override
	public byte[] getPhoto(int photoNo) throws SQLException {
		return albumService.getPhoto(photoNo);
	}

	@Override
	public int getFirstPhotoNo(int albumNo) throws SQLException {
		return albumService.getFirstPhotoNo(albumNo);
	}

	@Override
	public int getLastPhotoNo(int albumNo) throws SQLException {
		return albumService.getLastPhotoNo(albumNo);
	}

}
