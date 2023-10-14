/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DTO.BillDTO;
import coffee.DTO.CartDTO;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Hung Tuong Vy
 */
public class FileBLL {
    Date date=new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    String strDate = formatter.format(date);
    public void WriteFile_FW(String path) throws IOException{
        FileWriter fw=new FileWriter(path);
        PrintWriter pw=new PrintWriter(fw);
        pw.printf("");
        fw.close();
        pw.close();
    }
    public void WriteFile_FW(String path,ArrayList<CartDTO > Listcart) throws IOException{
        FileWriter fw=new FileWriter(path);
        PrintWriter pw=new PrintWriter(fw);
        for(int i=0;i<Listcart.size();i++)
        {
            pw.printf(strDate+";"+Listcart.get(i).getBarcode()+";"+Listcart.get(i).getProductName()+";"+Listcart.get(i).getSize()+";"+Listcart.get(i).getQty()+";"+Listcart.get(i).getTotal()+";"+Listcart.get(i).getNote()+"\r");
        }
        fw.close();
        pw.close();
    }
    public void WriteFile_FW(String path,CartDTO cart) throws IOException{
        FileWriter fw=new FileWriter(path,true);
        PrintWriter pw=new PrintWriter(fw);
        pw.printf(strDate+";"+cart.getBarcode()+";"+cart.getProductName()+";"+cart.getSize()+";"+cart.getQty()+";"+cart.getTotal()+";"+cart.getNote()+"\r");
        fw.close();
        pw.close();
    }
    public ArrayList<CartDTO> ReadFiletoList(String path) throws IOException{
        Scanner scan=new Scanner(Paths.get(path),"UTF-8");
        ArrayList<CartDTO> List=new ArrayList<>();
        while(scan.hasNextLine())
        {
            String row=scan.nextLine();
            if(row.equals(""))
                break;
            String[] data=row.split(";");
            List.add(new CartDTO(data[0],data[1],data[2],data[3],Integer.parseInt(data[4]),Integer.parseInt(data[5]) , data[6]));
        }
        return List;
    }
    public static void WriteFileExcel_Bills(String path,ArrayList<BillDTO> ListBill) throws FileNotFoundException, IOException{
        FileOutputStream file=new FileOutputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet worksheet=workbook.createSheet();
        XSSFRow Row;
        XSSFCell CellA;
        XSSFCell CellB;
        XSSFCell CellC;
        Row=worksheet.createRow((short)0);
        CellA=Row.createCell(0);
        CellA.setCellValue("ID");
        CellB=Row.createCell(1);
        CellB.setCellValue("DATE");
        CellC=Row.createCell(2);
        CellC.setCellValue("TOTAL");
        for(int i=0;i<ListBill.size();i++)
        {
            Row=worksheet.createRow((short)i+1);
            CellA=Row.createCell(0);
            CellA.setCellValue(ListBill.get(i).getId());
            CellB=Row.createCell(1);
            CellB.setCellValue(ListBill.get(i).getDate());
            CellC=Row.createCell(2);
            CellC.setCellValue(ListBill.get(i).getTotal());
        }
        workbook.write(file);
        workbook.close();
        file.close();
    }
}
