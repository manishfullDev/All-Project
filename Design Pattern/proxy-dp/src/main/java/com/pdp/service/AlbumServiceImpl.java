package com.pdp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pdp.bo.AlbumBo;
import com.pdp.bo.PhotoBo;
import com.pdp.dao.AlbumDao;
import com.pdp.dto.AlbumDto;
import com.pdp.dto.PhotoDto;

public class AlbumServiceImpl implements AlbumService {
	public List<AlbumDto> getAlbums() throws SQLException {
		List<AlbumDto> albumDtos = null;
		List<AlbumBo> albumBos = null;
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		albumBos = albumDao.getAlbums();
		albumDtos = new ArrayList<AlbumDto>();
		for (AlbumBo bo : albumBos) {
			albumDtos.add(new AlbumDto(bo.getAlbumNo(), bo.getDescription()));
		}
		return albumDtos;
	}

	public int getNoOfPhotos(int albumNo) throws SQLException {
		return new AlbumDao().getNoOfPhotos(albumNo);
	}

	public PhotoDto getFirstPhoto(int albumNo) throws SQLException {
		PhotoDto dto = null;
		PhotoBo bo = null;
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		bo = albumDao.getFirstPhoto(albumNo);
		dto = new PhotoDto(bo.getPhotoNo(), bo.getCaption(), bo.getPhotoMediaType());

		return dto;
	}

	public PhotoDto getNextPhoto(int albumNo, int cPhotoNo) throws SQLException {
		PhotoDto dto = null;
		PhotoBo bo = null;
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		bo = albumDao.getNextPhoto(albumNo, cPhotoNo);
		dto = new PhotoDto(bo.getPhotoNo(), bo.getCaption(), bo.getPhotoMediaType());

		return dto;
	}

	public PhotoDto getPrevPhoto(int albumNo, int cPhotoNo) throws SQLException {
		PhotoDto dto = null;
		PhotoBo bo = null;
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		bo = albumDao.getPrevPhoto(albumNo, cPhotoNo);
		dto = new PhotoDto(bo.getPhotoNo(), bo.getCaption(), bo.getPhotoMediaType());

		return dto;
	}

	public byte[] getPhoto(int photoNo) throws SQLException {
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		return albumDao.getPhoto(photoNo);
	}

	public int getFirstPhotoNo(int albumNo) throws SQLException {
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		return albumDao.getFirstPhotoNo(albumNo);
	}

	public int getLastPhotoNo(int albumNo) throws SQLException {
		AlbumDao albumDao = null;

		albumDao = new AlbumDao();
		return albumDao.getLastPhotoNo(albumNo);
	}
}
