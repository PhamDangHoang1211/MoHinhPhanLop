/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.BLL.ProductBLL;
import coffee.DTO.ProductDTO;
import coffee.DTO.categoryDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class ProductDAL {
    ArrayList<ProductDTO> ListProduct=new ArrayList<>();
    myConnectUnit unit=new myConnectUnit();
    public ArrayList<ProductDTO> getListProduct() throws Exception{
        ResultSet result=unit.Select("product");
        while(result.next())
        {
            int id=Integer.parseInt(result.getString("id"));
            int id_cate=Integer.parseInt(result.getString("category_id"));
            int size=Integer.parseInt(result.getString("size"));
            int price=Integer.parseInt(result.getString("price"));
            int qty=Integer.parseInt(result.getString("qty"));
            int status=Integer.parseInt(result.getString("status"));
            ProductDTO pro1=new ProductDTO(id,result.getString("product_name"),result.getString("descrip"),id_cate,size,price, qty,result.getString("barcode"), status);
            ListProduct.add(pro1);
        }
        return ListProduct;
    }
    public ArrayList<ProductDTO> getProduct_Category(String Category) throws Exception{
            String Condition=" category_id= ";
            ProductBLL productBLL=new ProductBLL();
            int ID = productBLL.getCategoryId(Category);
            Condition=Condition+Integer.toString(ID);
            ResultSet result=unit.Select("product",Condition);
            while(result.next())
        {
            int id=Integer.parseInt(result.getString("id"));
            int id_cate=Integer.parseInt(result.getString("category_id"));
            int size=Integer.parseInt(result.getString("size"));
            int price=Integer.parseInt(result.getString("price"));
            int qty=Integer.parseInt(result.getString("qty"));
            int status=Integer.parseInt(result.getString("status"));
            ProductDTO pro1=new ProductDTO(id,result.getString("product_name"),result.getString("descrip"),id_cate,size,price, qty,result.getString("barcode"), status);
            ListProduct.add(pro1);
        }
        return ListProduct;     
    }
}
