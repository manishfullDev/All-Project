package com.sfmi.beans;

import java.util.Calendar;

public class Meeting {
	private Calendar meetingSchedule;
	private String meetingName;

	public void setMeetingSchedule(Calendar meetingSchedule) {
		this.meetingSchedule = meetingSchedule;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	@Override
	public String toString() {
		return "Meeting [meetingSchedule=" + meetingSchedule + ", meetingName=" + meetingName + "]";
	}

}
