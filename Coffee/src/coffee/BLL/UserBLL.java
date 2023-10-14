/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DAL.UserDAL;
import coffee.DAL.myConnectUnit;
import coffee.DTO.UserDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hung Tuong Vy
 */
public class UserBLL {
    public boolean check (String Name,String Password , String ConPassword) throws Exception{
        UserDAL userDAL=new UserDAL();
        ArrayList<UserDTO> ListUser=userDAL.getListUsers();
        for(int i=0;i<ListUser.size();i++)
        {
            if(Name.equals(ListUser.get(i).getUsername())==true)
            {
                JOptionPane.showMessageDialog(null, "Username is existed !!!","Warning !!!",JOptionPane.YES_OPTION);
                return false;
            }
        }
        if(!Password.equals(ConPassword)||Password.equals("")){
            JOptionPane.showMessageDialog(null, "Password not matched","Warning !!!",JOptionPane.YES_OPTION);
            return false;
        }
        return true;
    }
    public boolean checkID(int id) throws Exception{
        UserDAL userDAL=new UserDAL();
        ArrayList<UserDTO> ListUser=userDAL.getListUsers();
        for(int i=0;i<ListUser.size();i++)
        {
            if(id==ListUser.get(i).getStaffId())
            {
                JOptionPane.showMessageDialog(null, "Account is created for this cashier !!!", "Warning",JOptionPane.YES_OPTION);
                return false;
            }
        }
        return true;
    }
    public HashMap<String,Object> getMap(int id,String Name,String Password , String ConPassword) throws Exception{
        HashMap<String,Object> valueInsert=new HashMap<>();
        valueInsert.put("username", Name);
        valueInsert.put("password", Password);
        valueInsert.put("status", 0);
        valueInsert.put("staff_id", id);
        return valueInsert;
    }
    public void insertData(HashMap<String,Object> Map){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Insert("user", Map);
        } catch (Exception ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
