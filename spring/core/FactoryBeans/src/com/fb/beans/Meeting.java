package com.fb.beans;

import java.util.Calendar;

public class Meeting {
	private String meetingName;
	private Calendar meetingSchedule;

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public void setMeetingSchedule(Calendar meetingSchedule) {
		this.meetingSchedule = meetingSchedule;
	}

	@Override
	public String toString() {
		return "Meeting [meetingName=" + meetingName + ", meetingSchedule=" + meetingSchedule.getTime() + "]";
	}

}
