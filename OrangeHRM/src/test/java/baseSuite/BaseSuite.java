package baseSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class BaseSuite {

	@DataProvider(name = "getValue")
	public static Object[][] DataSupplier(Method method) throws IOException {

		File file = new File(System.getProperty("user.dir")+"/Data/OrangeHRM.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(method.getName());

		int rowCount = sheet.getLastRowNum();

		System.out.println("total no of rows are " + rowCount);

		int colCount = sheet.getRow(0).getLastCellNum();

		System.out.println("total no of columns are " + colCount);

		Object[][] data = new Object[rowCount][colCount];

		DataFormatter df = new DataFormatter();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {
				// data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();

				Cell value = sheet.getRow(i + 1).getCell(j);
				data[i][j] = df.formatCellValue(value);
			}
		}
		workbook.close();
		return data;
	}

}
