package com.views.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.views.dto.BusProvidersDto;

public class BusProviderPdfView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<BusProvidersDto> busProvidersDtos = null;
		Table pdfTable = null;
		
		busProvidersDtos = (List<BusProvidersDto>) model.get("busProviders");
		pdfTable = new Table(3);
		for(BusProvidersDto dto : busProvidersDtos) {
			pdfTable.addCell(dto.getBusinessName());
			pdfTable.addCell(dto.getContactNo());
			pdfTable.addCell(dto.getEmailAddress());
		}
		document.add(pdfTable);
	}
}















