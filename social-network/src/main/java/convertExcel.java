import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class convertExcel {
public static void main(String[] args) throws IOException {    

	//BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Jyoti\\TRACTOR12176.txt"));
	//File userDir=new File("D:\\Jyoti\\");
	File userDir=new File("Z:\\asv\\capacity\\master\\txt\\");
	File[] allfiles=userDir.listFiles();
	
	//Create new excel file
	//FileOutputStream out = new FileOutputStream("D:\\MYOutput\\");
	
	//Create new workbook
	HSSFWorkbook wb = new HSSFWorkbook();
	//create new sheet
	HSSFSheet sheet1 = wb.createSheet("new sheet");
	
	//  System.out.println(sheet1);
	
	 int cols = 0; // No of columns
 
	 String line= null;
	String[] temp = null;
	
	int rowNo=1;
	HashMap<Integer,String> parentlevel= new HashMap<Integer,String>();
	HSSFRow row1= sheet1.createRow(0);

	HSSFCell cellA= row1.createCell(0);
	HSSFCell cellB= row1.createCell(1);
	HSSFCell cellC= row1.createCell(2);
	HSSFCell cellD= row1.createCell(3);
	HSSFCell cellE= row1.createCell(4);
	HSSFCell cellF= row1.createCell(5);
	HSSFCell cellG= row1.createCell(6);
	
	cellA.setCellValue("Serial Number");
	cellB.setCellValue("Parent");
	cellC.setCellValue("Level");
	cellD.setCellValue("Item Number");
	cellE.setCellValue("Item Description");
	cellF.setCellValue("Quantity");
	cellG.setCellValue("UOM");
	
	for(int  i=0;i<allfiles.length;i++){
		System.out.println(" i is ++++++++++++"+i);
		//System.out.println("file is ::::::::::"+allfiles[i]);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(allfiles[i]));      
		System.out.println("name of file ********************************"+allfiles[i].getName());
		
		//substring(0, chapterNumber.indexOf("."));
		String str= allfiles[i].getName().replace(".txt", ".xls");
		System.out.println("str is ::"+ str);
	//	System.out.println("buffer reader val  ::::::::::::"+ bufferedReader.toString());
		


		while ((line = bufferedReader.readLine())!= null) {
    	
    	
    	String Serial_Number= line.substring(0, 15).trim();
    	//String parentNumber = line.substring(126, 136).trim();
    	int level=Integer.parseInt(line.substring(85, 89).trim());
    	String Item_Number=line.substring(15, 29).trim();
    	String Item_Desc=line.substring(30, 60).trim();
    	double Quantity = Double.parseDouble(line.substring(60, 71).trim())/1000;
    	String UOM=line.substring(124, 126).trim();
	
    	HSSFRow row = sheet1.createRow(rowNo++);
    	sheet1.createFreezePane(0, 1);
    
    	HSSFCell cell=row.createCell(0);
    	HSSFCell cell1=row.createCell(1);
    	HSSFCell cell2=row.createCell(2);
    	HSSFCell cell3=row.createCell(3);
    	HSSFCell cell4=row.createCell(4);
    	HSSFCell cell5=row.createCell(5);
    	HSSFCell cell6=row.createCell(6);
    	
    	
    	 cell.setCellValue(Serial_Number); 
		// cell1.setCellValue(s2);
		 cell2.setCellValue(level);
		 cell3.setCellValue(Item_Number);
		 cell4.setCellValue(Item_Desc);
		 cell5.setCellValue(Quantity);
		 cell6.setCellValue(UOM);
		 //System.out.println(line);

		 parentlevel.put(level, Item_Number);
		 if(level==1){
			 cell1.setCellValue(Serial_Number);
		 }
		 else{
			 cell1.setCellValue(parentlevel.get(level-1));
		 }

		 //FileOutputStream out = new FileOutputStream("D:\\MYOutput\\"+str);
		 FileOutputStream out = new FileOutputStream("D:\\New _Out\\"+str);
		 wb.write(out); 
			out.close();
    }
	}
	}
 }

	
	