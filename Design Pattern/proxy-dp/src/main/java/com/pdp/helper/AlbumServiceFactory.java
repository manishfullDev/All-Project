package com.pdp.helper;

import com.pdp.service.AlbumService;
import com.pdp.service.AlbumServiceImpl;
import com.pdp.service.CachedAlbumServiceImpl;

public class AlbumServiceFactory {
	private static AlbumService albumService = new CachedAlbumServiceImpl(new AlbumServiceImpl());

	public static AlbumService getAlbumService() {
		return albumService;
	}
}
