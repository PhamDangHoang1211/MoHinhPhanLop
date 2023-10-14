/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import coffee.BLL.ProductBLL;
import coffee.DAL.MySQLConnect;
import coffee.DAL.ProductDAL;
import coffee.DAL.categoryDAL;
import coffee.DAL.myConnectUnit;
import coffee.DTO.ProductDTO;
import coffee.DTO.categoryDTO;
import coffee.Form.AdminMenu;
import coffee.Form.Login;
import coffee.Form.MakeColorByMe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Hung Tuong Vy
 */
public class NewClass {
     public static void main(String[] args) throws Exception {
        // TODO code application logic here
         
        
//        MySQLConnect connect=new MySQLConnect("localhost", "root", "", "coffee");
//         myConnectUnit unit=new myConnectUnit();
//         HashMap<String,Object> valueInsert=new HashMap<>();
//         valueInsert.put("categories_name", "bi");
//         System.out.println(valueInsert);
//         unit.Insert("categories", valueInsert);
//        connect.Close();           
//          new AdminMenu().setVisible(true);
//          
//            ProductDAL tool=new ProductDAL();
//           ArrayList<ProductDTO> abc=new ArrayList<>();
//           abc=tool.getListProduct();
//           for(int i=0;i<3;i++)
//           {
//               
//               System.out.println(abc.get(i).getPrice());
//           }
            
           MakeColorByMe maumevl=new MakeColorByMe();
           maumevl.setVisible(true);
           try {
             for(int i=0;i<=100;i++)
             {
                 Thread.sleep(20);
                 maumevl.lbl.setText(Integer.toString(i)+"%");
                 Login login=new Login();
                 if(i==100){
                     maumevl.dispose();
                     login.show();
                 }
             }
         } catch (Exception e) {
         }
           
    }

    private static int CountRow(ResultSet result) throws SQLException {
        int i=0;
        while(result.next())
        {
            i++;
        }
        return i;
    }
}
