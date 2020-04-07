package com.jpaconfig.test;

import java.util.Date;

import com.jpaconfig.accessor.RecordingStudioAccessor;
import com.jpaconfig.entities.RecordingStudio;

public class JpaConfigTest {
	public static void main(String[] args) {
		RecordingStudio studio = null;
		RecordingStudioAccessor accessor = null;

		accessor = new RecordingStudioAccessor();
		studio = new RecordingStudio(1, "Saradhi Studios", new Date(), "Saradhi Studios Road", "hyderabad", "ts", 9393,
				"India", "3039304", "contactus@saradhistudio.com");
		accessor.saveRecordingStudio(studio);
	}
}
