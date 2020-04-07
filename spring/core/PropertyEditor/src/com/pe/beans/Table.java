package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class Table {
	private Date manufacturedDate;
	private File image;
	private URL link;
	private String[] specifications;

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public void setLink(URL link) {
		this.link = link;
	}

	public void setSpecifications(String[] specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "Table [manufacturedDate=" + manufacturedDate + ", image=" + image + ", link=" + link
				+ ", specifications=" + Arrays.toString(specifications) + "]";
	}

}
