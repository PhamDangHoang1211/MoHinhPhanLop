/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import coffee.DTO.StaffDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hung Tuong Vy
 */
public class StaffDAL {
    ArrayList<StaffDTO> ListStaff=new ArrayList<>();
    myConnectUnit unit=new myConnectUnit();
    public ArrayList<StaffDTO> getListStaff()
    {
        try {
            ResultSet result=unit.Select("staff");
            int c=unit.getColumnCount(result);
            while(result.next()){
                StaffDTO staff=new StaffDTO(Integer.parseInt(result.getString("id")),result.getString("firstname"),result.getString("lastname"),Integer.parseInt(result.getString("gender")),Integer.parseInt(result.getString("phone")), result.getString("position"),Integer.parseInt(result.getString("shift")), result.getString("image"));
                ListStaff.add(staff);
            }
        } catch (Exception ex) {
            Logger.getLogger(StaffDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListStaff;
    }
    public StaffDTO getStaff(String id) throws Exception{
        StaffDTO staff=new StaffDTO();
        String Condition="id= "+id;
        ResultSet result=unit.Select("staff", Condition);
        while(result.next())
        {
            staff=new StaffDTO(Integer.parseInt(result.getString("id")),result.getString("firstname"),result.getString("lastname"),Integer.parseInt(result.getString("gender")),Integer.parseInt(result.getString("phone")), result.getString("position"),Integer.parseInt(result.getString("shift")), result.getString("image"));
        }
        System.out.println(staff.getFirstname());
        return staff;
    }
}
