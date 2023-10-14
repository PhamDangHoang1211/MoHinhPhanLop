/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.UserDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class UserDAL {
    ArrayList<UserDTO> ListUser=new ArrayList<>();
    myConnectUnit unit=new myConnectUnit();
    public ArrayList<UserDTO> getListUsers() throws Exception{
        ResultSet result =unit.Select("user");
        int c=myConnectUnit.getColumnCount(result);
        while(result.next())
        {
            int id=Integer.parseInt(result.getString("id"));
            int status=Integer.parseInt(result.getString("status"));
            UserDTO user=new UserDTO(id,result.getString("username"), result.getString("password"),status,Integer.parseInt(result.getString("staff_id")));
            ListUser.add(user);
        }
        return ListUser;
    }
}
