package com.views.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.views.dto.BusProvidersDto;

public class BusProviderExcelView extends AbstractXlsView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<BusProvidersDto> busProvidersDtos = null;
		Sheet busProvidersSheet = null;
		BusProvidersDto dto = null;
		Row busProviderRow = null;
		Cell businessNameCell = null;
		Cell contactNoCell = null;
		Cell emailAddressCell = null;

		busProvidersDtos = (List<BusProvidersDto>) model.get("busProviders");
		busProvidersSheet = workbook.createSheet("bus providers");

		Row header = busProvidersSheet.createRow(0);
		Cell cell1 = header.createCell(0);
		cell1.setCellValue("Business Name");

		Cell cell2 = header.createCell(1);
		cell2.setCellValue("Contact No");

		Cell cell3 = header.createCell(2);
		cell3.setCellValue("Email Address");

		for (int i = 0; i < busProvidersDtos.size(); i++) {
			dto = busProvidersDtos.get(i);
			busProviderRow = busProvidersSheet.createRow(i + 1);
			businessNameCell = busProviderRow.createCell(0);
			contactNoCell = busProviderRow.createCell(1);
			emailAddressCell = busProviderRow.createCell(2);

			businessNameCell.setCellValue(dto.getBusinessName());
			contactNoCell.setCellValue(dto.getContactNo());
			emailAddressCell.setCellValue(dto.getEmailAddress());
		}

	}
}
