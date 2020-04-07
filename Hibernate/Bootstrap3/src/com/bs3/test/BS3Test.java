package com.bs3.test;

import java.io.IOException;

import com.bs3.accessor.AlbumAccessor;
import com.bs3.entities.Album;
import com.bs3.helper.ProgSessionFactoryHelper;
import com.bs3.helper.ServiceRegistrySessionFactoryHelper;
import com.bs3.helper.SessionFactoryHelper;

public class BS3Test {
	public static void main(String[] args) throws IOException {
		try {
			AlbumAccessor albumAccessor = new AlbumAccessor();
			Album album = albumAccessor.getAlbum(1);
			System.out.println(album);
		} finally {
			SessionFactoryHelper helper = ServiceRegistrySessionFactoryHelper.getInstance();
			helper.closeSessionFactory();
		}
	}
}
