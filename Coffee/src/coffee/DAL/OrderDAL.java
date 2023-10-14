/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.OrderDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class OrderDAL {
    myConnectUnit unit=new myConnectUnit();
    ArrayList<OrderDTO> List=new ArrayList<>();
    public ArrayList<OrderDTO> getList() throws Exception{

            ResultSet result=unit.Select("orders");
            while(result.next())
            {
                OrderDTO order=new OrderDTO(Integer.parseInt(result.getString("id")),result.getString("product"),Integer.parseInt(result.getString("total")), Integer.parseInt(result.getString("cashier_id")), Integer.parseInt(result.getString("bill_id")), Integer.parseInt(result.getString("qty")), result.getString("size"));
                List.add(order);
            }
            return List;
       
    }
}
