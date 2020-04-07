package com.pdp.bo;

import java.io.Serializable;

public class AlbumBo implements Serializable {
	protected int albumNo;
	protected String description;

	public AlbumBo(int albumNo, String description) {
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
