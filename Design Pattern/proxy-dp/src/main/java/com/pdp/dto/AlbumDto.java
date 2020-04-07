package com.pdp.dto;

import java.io.Serializable;

public class AlbumDto implements Serializable {
	protected int albumNo;
	protected String description;

	public AlbumDto(int albumNo, String description) {
		super();
		this.albumNo = albumNo;
		this.description = description;
	}

	public int getAlbumNo() {
		return albumNo;
	}

	public void setAlbumNo(int albumNo) {
		this.albumNo = albumNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
