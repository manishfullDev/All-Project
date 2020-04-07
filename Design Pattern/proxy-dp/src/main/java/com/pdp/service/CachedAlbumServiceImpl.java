package com.pdp.service;

import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachedAlbumServiceImpl extends AbstractAlbumService {
	private Map<Integer, byte[]> photosMap;

	public CachedAlbumServiceImpl(AlbumService albumService) {
		super(albumService);
		photosMap = new ConcurrentHashMap<Integer, byte[]>();
	}

	@Override
	public byte[] getPhoto(int photoNo) throws SQLException {
		byte[] content = null;

		if (photosMap.containsKey(photoNo)) {
			content = photosMap.get(photoNo);
		} else {
			synchronized (photosMap) {
				if (photosMap.size() > 5) {
					int rPhotoNo = photosMap.keySet().iterator().next();
					photosMap.remove(rPhotoNo);
				}
			}

			content = super.getPhoto(photoNo);
			photosMap.put(photoNo, content);
		}
		return content;
	}

}
