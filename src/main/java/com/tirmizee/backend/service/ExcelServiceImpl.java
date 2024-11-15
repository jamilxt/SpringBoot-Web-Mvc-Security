package com.tirmizee.backend.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import com.tirmizee.backend.api.file.data.MockDataDTO;
import com.tirmizee.core.utilities.DateUtils;

@Service
public class ExcelServiceImpl implements ExcelService {

	@Override
	public List<MockDataDTO> readData(Workbook workbook) {
		
		List<MockDataDTO> result = new ArrayList<>();
		Sheet worksheet = workbook.getSheetAt(0);
		
		int rowNum = 1;
		while (rowNum <= worksheet.getLastRowNum()) {
			
			MockDataDTO mockData = new MockDataDTO();
			Row row = worksheet.getRow(rowNum++);
			
			Cell cell_0 = row.getCell(0);
			cell_0.setCellType(CellType.STRING);
			mockData.setAppCode(cell_0.getStringCellValue());
			
			Cell cell_1 = row.getCell(1);
			cell_1.setCellType(CellType.STRING);
			mockData.setAppName(cell_1.getStringCellValue());
			
			Cell cell_2 = row.getCell(2);
			cell_2.setCellType(CellType.STRING);
			mockData.setAppVersion(cell_2.getStringCellValue());
			
			Cell cell_3 = row.getCell(3);
			cell_3.setCellType(CellType.STRING);
			mockData.setPrice(new BigDecimal(cell_3.getStringCellValue()));
			
			Cell cell_4 = row.getCell(4);
			cell_4.setCellType(CellType.STRING);
			mockData.setSize(cell_4.getStringCellValue());
			
			try {
				Cell cell_5 = row.getCell(5);
				cell_5.setCellType(CellType.STRING);
				mockData.setDate(DateUtils.toDateFormat(cell_5.getStringCellValue(), "yyyy-mm-dd"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			Cell cell_6 = row.getCell(6);
			cell_6.setCellType(CellType.STRING);
			mockData.setCountry(cell_6.getStringCellValue());
			
			mockData.setValid(true);
			
			result.add(mockData);
		}	
		return result;
	}
	
}
