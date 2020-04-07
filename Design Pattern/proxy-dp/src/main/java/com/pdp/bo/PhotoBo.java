package com.pdp.bo;

import java.io.Serializable;

public class PhotoBo implements Serializable {
	protected int photoNo;
	protected String caption;
	protected String photoMediaType;

	public PhotoBo(int photoNo, String caption, String photoMediaType) {
		super();
		this.photoNo = photoNo;
		this.caption = caption;
		this.photoMediaType = photoMediaType;
	}

	public int getPhotoNo() {
		return photoNo;
	}

	public void setPhotoNo(int photoNo) {
		this.photoNo = photoNo;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getPhotoMediaType() {
		return photoMediaType;
	}

	public void setPhotoMediaType(String photoMediaType) {
		this.photoMediaType = photoMediaType;
	}

}
