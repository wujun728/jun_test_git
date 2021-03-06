package com.jun.plugin.poitest.exp.processor;

import org.apache.poi.xssf.usermodel.XSSFRow;

import com.jun.plugin.poitest.exp.context.PoiExporterContext;

public interface RowProcessor {
	int dealRow(XSSFRow currentRow, PoiExporterContext peContext);
	int support(XSSFRow row);
}
