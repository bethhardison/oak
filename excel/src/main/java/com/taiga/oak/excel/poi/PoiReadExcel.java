package com.taiga.oak.excel.poi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class PoiReadExcel {

	public static void main(String[] args) {
		File file = new File("e:/poi.xls");

		try {
			//创建excel工作簿 读取文件内容
			//XSSFWorkbook

			HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));

			//获取第一个工作表
			//HSSFSheet sheet = workbook.getSheet("Sheet0");
			HSSFSheet sheet = workbook.getSheetAt(0);
			int firstRowNum = 0;
			int lastRowNum = sheet.getLastRowNum();
			for (int i = firstRowNum; i < lastRowNum; i++) {
				HSSFRow row = sheet.getRow(i);
				//获取当前行最后单元格列号
				int lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum; j++) {
					HSSFCell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.err.print(value + "  ");
				}
				System.err.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
