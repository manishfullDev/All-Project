package com.tm.test;

import java.util.Date;

import com.tm.accessor.JobsheetAccessor;
import com.tm.entities.Jobsheet;
import com.tm.helper.SessionFactoryHelper;

public class TMTest {
	public static void main(String[] args) {
		try {
			JobsheetAccessor jobsheetAccessor = new JobsheetAccessor();
			Jobsheet jobsheet = new Jobsheet();
			jobsheet.setJobsheetNo(2);
			jobsheet.setOpenedDate(new Date());
			jobsheet.setDescription("Third Service");
			jobsheet.setVehicleNo("TS 09 BG 3944");
			jobsheet.setEstimatedDeliveryDate(new Date());
			jobsheet.setEstimatedAmount(3000);
			jobsheet.setStatus("pending");
			jobsheetAccessor.saveJobSheet(jobsheet);
			System.out.println("jobsheet saved...");
		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}

	}
}











