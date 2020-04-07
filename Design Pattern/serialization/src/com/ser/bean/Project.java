package com.ser.bean;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
	private static final long serialVersionUID = -6364363890105378555L;
	protected int projectNo;
	protected String title;
	protected Date startedDate;
	protected int duration;

	public Project() {
		System.out.println("project()");
	}

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", title=" + title + ", startedDate=" + startedDate + ", duration="
				+ duration + "]";
	}

}
