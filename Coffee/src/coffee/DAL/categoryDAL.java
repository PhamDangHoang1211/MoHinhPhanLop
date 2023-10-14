/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.categoryDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Hung Tuong Vy
 */
public class categoryDAL {
    MySQLConnect connect=new MySQLConnect();
    myConnectUnit unit=new myConnectUnit();
    ArrayList<categoryDTO> listCate=new ArrayList<categoryDTO>();
    public ArrayList<categoryDTO> getAllCategories() throws Exception{
        ResultSet result=unit.Select("categories");
          while(result.next())
        {
            
                int temp2=Integer.parseInt(result.getString("status"));
                int id_temp=Integer.parseInt(result.getString("id"));
                categoryDTO cate=new categoryDTO(id_temp,temp2,result.getString("categories_name"));
                listCate.add(cate);
        }
        connect.Close();
        return listCate;
    }
    public ArrayList<categoryDTO> getCategoryListIsActive() throws Exception{
        String condition=" status =1 ";
        ResultSet result=unit.Select("categories",condition);
          while(result.next())
        {
            
                int temp2=Integer.parseInt(result.getString("status"));
                int id_temp=Integer.parseInt(result.getString("id"));
                categoryDTO cate=new categoryDTO(id_temp,temp2,result.getString("categories_name"));
                listCate.add(cate);
        }
        connect.Close();
        return listCate;
    }
}
