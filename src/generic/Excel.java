package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getCellvalue(String path,String sheet,int r,int c) {
		String s=" ";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			s=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e) {
			e.printStackTrace();}
		return s;
		}
	public static int getRowCount(String path,String sheet) {
		int rc=0;
		try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		rc=wb.getSheet(sheet).getLastRowNum();}
		catch(Exception e) {
			e.printStackTrace();}
		return rc;
		}
	}


