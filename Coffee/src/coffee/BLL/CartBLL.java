/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DAL.ProductDAL;
import coffee.DAL.myConnectUnit;
import coffee.DTO.CartDTO;
import coffee.DTO.MiniProductDTO;
import coffee.DTO.ProductDTO;
import coffee.Form.PrintBills;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author Hung Tuong Vy
 */
public class CartBLL {
    Date date=new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    String strDate = formatter.format(date);
    public CartDTO AddToCart(MiniProductDTO product,String Size,int qty, int price,String Note){
        CartDTO Cart=new CartDTO(product.getBarcode(), product.getName(), Size, qty, price, Note);
        return Cart;
    }
    public void Print(String Name,int Sub, int Pay,int Bal ,TableModel tableModel) throws PrinterException{
        new PrintBills(Name,Sub, Pay, Bal,tableModel).setVisible(true);
    }
    public HashMap<String,Object> getMap(CartDTO MiniProduct ,int cashier_id,int bill_id){
         HashMap<String,Object> valueInsert=new HashMap<>();
        valueInsert.put("product", MiniProduct.getProductName());
        valueInsert.put("total", MiniProduct.getTotal());
        valueInsert.put("cashier_id", cashier_id);
        valueInsert.put("bill_id",bill_id);
        valueInsert.put("qty", MiniProduct.getQty());
        valueInsert.put("size", MiniProduct.getSize());
        
        return valueInsert;
    }
    public HashMap<String,Object> BillMap(int subtotal){
        HashMap<String,Object> valueInsert=new HashMap<>();
        valueInsert.put("date",strDate);
        valueInsert.put("total",subtotal);
        return valueInsert;
    }
    public void updateData(HashMap<String,Object> Map, String Condition){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Update("`orders`", Map, Condition);
        } catch (Exception ex) {
            Logger.getLogger(CartBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createBill(HashMap<String,Object> Map){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Insert("`bills`", Map);  
        } catch (Exception ex) {
            Logger.getLogger(CartBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void insertData(HashMap<String,Object> Map){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Insert("`orders`", Map);  
        } catch (Exception ex) {
            Logger.getLogger(CartBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateQty(ArrayList<CartDTO> List) throws Exception{
        myConnectUnit unit=new myConnectUnit();
        ArrayList<ProductDTO> ListProduct=new ProductDAL().getListProduct();
        for(int i=0;i<List.size();i++)
        {
            for(int j=0;j<ListProduct.size();j++)
            {
                if(List.get(i).getProductName().equals(ListProduct.get(j).getName()))
                {
                    HashMap<String,Object> insertValue=new HashMap<>();
                    int qty=ListProduct.get(j).getQty()-List.get(i).getQty();
                    insertValue.put("qty", qty);
                    String Condition=" id= "+ListProduct.get(j).getId();
                    unit.Update("product",insertValue,Condition);
                }
            }
        }
    }
}
