/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.BillDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class BillDAL {
    myConnectUnit unit=new myConnectUnit();
    ArrayList<BillDTO> List=new ArrayList<>();
    public ArrayList<BillDTO> getList() throws Exception{
        BillDTO bill=new BillDTO();
        ResultSet result=unit.Select("bills");
        int c=unit.getColumnCount(result);
        while(result.next())
        {
            bill=new BillDTO(Integer.parseInt(result.getString("id")), result.getString("date"), Integer.parseInt(result.getString("total")));
            List.add(bill);
        }
        return List;
    }
}
