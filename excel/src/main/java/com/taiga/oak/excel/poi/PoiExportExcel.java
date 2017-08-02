package com.taiga.oak.excel.poi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiExportExcel {

	public static void main(String[] args) {
		String[] title = {"id", "name", "sex"};

		//创建excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		//创建一个工作吧sheet
		HSSFSheet sheet = workbook.createSheet();
		//创建第一行
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;

		//插入第一行数据id,name,sex
		for (int i = 0; i < title.length; i++) {
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}

		//追加数据
		for (int i = 1; i <= 10; i++) {
			HSSFRow nextRow = sheet.createRow(i);
			HSSFCell cell2 = nextRow.createCell(0);
			cell2.setCellValue("a" + i);

			cell2 = nextRow.createCell(1);
			cell2.setCellValue("user" + i);

			cell2 = nextRow.createCell(2);
			cell2.setCellValue("男");
		}
		//创建一个文件
		File file = new File("e:/poi.xls");
		try {
			file.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
		} catch (IOException e) {

		}

	}
}
