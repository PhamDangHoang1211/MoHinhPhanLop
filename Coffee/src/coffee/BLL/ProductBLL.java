/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DAL.categoryDAL;
import coffee.DAL.myConnectUnit;
import coffee.DTO.ProductDTO;
import coffee.DTO.categoryDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hung Tuong Vy
 */
public class ProductBLL {
    //Chỉ lấy những category Active
    public ArrayList<categoryDTO> getCategoriesItemActive() throws Exception{
        ArrayList<categoryDTO> List=new ArrayList<>();
        List=new categoryDAL().getAllCategories();
        for(int i=0;i<List.size();i++)
        {
            if(List.get(i).getStatus()==0)
                List.remove(i);
        }
        return List;
    }
    public String getNameCategory(int CategoryID) throws Exception{
        ArrayList<categoryDTO> List=new ArrayList<>();
        List=new categoryDAL().getAllCategories();
        for(int i=0;i<List.size();i++)
        {
            if(CategoryID==List.get(i).getId())
            {
                return List.get(i).getCate_name();
            }
        }
        return null;
    }
    public String getSize(int Size)
    {
        if(Size==1)
        {
            return "S";
        }
        if(Size==2)
        {
            return "M";
        }
        if(Size==3)
        {
            return "S-M";
        }
        if(Size==4)
        {
            return "None";
        }
        return null;
    }
    public int getSizeID(String Size)
    {
        switch(Size)
        {
            case "S": return 1;
            case "M": return 2;
            case "S-M": return 3;
            case "None": return 4;
        }
          return -1;  
    }
    public String getStatus(int Status){   
            if(Status==1)
            {
                return "Active";
            }
            if(Status==0)
            {
                return "Deactive";
            }
         return null;
    }
    public int getStatusId(String Status)
    {
        if(Status=="Active")
        {
            return 1;
        }
        if(Status=="Deactive")
        {
            return 0;
        }
        return -1;
    }
    public int getCategoryId(String CategoryName) throws Exception
    {
        ArrayList<categoryDTO> List=new ArrayList<>();
        List=new categoryDAL().getAllCategories();
        for(int i=0;i<List.size();i++)
        {
            if(CategoryName.equals(List.get(i).getCate_name()))
            {
                return List.get(i).getId();
            }
        }
        return 0;
    }
//    public void InsertData(String product_name,int category_id,int size , int price, int qty,String barcode,int status,String Description)
//    {
//        try {
//            myConnectUnit unit=new myConnectUnit();
//            HashMap<String,Object> valueInsert=new HashMap<>();
//            valueInsert.put("product_name", product_name);
//            valueInsert.put("category_id", category_id);
//            valueInsert.put("size", Integer.toString(size));
//            valueInsert.put("price", Integer.toString(price));
//            valueInsert.put("qty", Integer.toString(qty));
//            valueInsert.put("barcode",barcode);
//            valueInsert.put("status", Integer.toString(status));
//            valueInsert.put("descrip", Description);
//            unit.Insert("product", valueInsert);
//            JOptionPane.showMessageDialog(null, "Add Succecced !!!");
//        } catch (Exception ex) {
//            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public void updateData(HashMap<String,Object> Map, String Condition){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Update("product", Map, Condition);
        } catch (Exception ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertData(HashMap<String,Object> Map){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Insert("product", Map);
        } catch (Exception ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public HashMap<String,Object> getMap(ProductDTO Product)
    {
            HashMap<String,Object> valueInsert=new HashMap<>();
            valueInsert.put("product_name",Product.getName());
            valueInsert.put("category_id",Product.getCategoryType() );
            valueInsert.put("size",Product.getSize());
            valueInsert.put("price",Product.getPrice());
            valueInsert.put("qty", Product.getQty());
            valueInsert.put("barcode",Product.getBarcode());
            valueInsert.put("status", Product.getStatus());
            valueInsert.put("descrip",Product.getDescription());
            return valueInsert;
    }
    
}
