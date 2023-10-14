/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DAL.UserDAL;
import coffee.DAL.myConnectUnit;
import coffee.DTO.UserDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hung Tuong Vy
 */
public class LoginBLL {
    ArrayList<UserDTO> ListUsers=new ArrayList<>();
    UserDAL user=new UserDAL();
    public int checkID(String username,String Password) throws Exception{
        ListUsers=user.getListUsers();
        for(int i=0;i<ListUsers.size();i++)
        {
            if(username.equals(ListUsers.get(i).getUsername())&&Password.equals(ListUsers.get(i).getPassword()))
            {
                if(ListUsers.get(i).getStatus()==1)
                {
                    return 1;
                }
                if(ListUsers.get(i).getStatus()==0)
                    return 0;
            }
        }
        return -1;
    }
    public int getId(String username,String Password) throws Exception{
        myConnectUnit unit=new myConnectUnit();
        String temp=" username = '"+username+"'";
        ResultSet result=unit.Select("user",temp );
        UserDTO userDTO=new UserDTO();
        while(result.next())
        {
            userDTO=new UserDTO(Integer.parseInt(result.getString("id")),result.getString("username"),result.getString("password"), Integer.parseInt(result.getString("status")), Integer.parseInt(result.getString("staff_id")));
        }
        return userDTO.getId();
    }
    public int getStaffID(String username,String Password) throws Exception{
        myConnectUnit unit=new myConnectUnit();
        String temp=" username = '"+username+"'";
        ResultSet result=unit.Select("user",temp );
        UserDTO userDTO=new UserDTO();
        while(result.next())
        {
            userDTO=new UserDTO(Integer.parseInt(result.getString("id")),result.getString("username"),result.getString("password"), Integer.parseInt(result.getString("status")), Integer.parseInt(result.getString("staff_id")));
        }
        return userDTO.getStaffId();
    }
}
