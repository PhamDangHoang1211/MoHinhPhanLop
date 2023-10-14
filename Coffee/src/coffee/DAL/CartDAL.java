/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.BillDTO;
import coffee.DTO.CartDTO;
import coffee.DTO.ProductDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class CartDAL {
    public BillDTO getBill() throws Exception{
        myConnectUnit unit=new myConnectUnit();
        BillDTO bill=new BillDTO();
        ResultSet result=unit.Select("`bills`",null," ID DESC LIMIT 1");
        while(result.next())
        {
            bill=new BillDTO(Integer.parseInt(result.getString("id")), result.getString("date"),Integer.parseInt(result.getString("total")));
        }
        return bill;
    }
}
