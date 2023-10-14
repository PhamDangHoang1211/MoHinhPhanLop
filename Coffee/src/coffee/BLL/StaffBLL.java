/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.BLL;

import coffee.DAL.myConnectUnit;
import coffee.DTO.StaffDTO;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hung Tuong Vy
 */
public class StaffBLL {
    public HashMap<String,Object> getMap(StaffDTO Staff){
         HashMap<String,Object> valueInsert=new HashMap<>();
            valueInsert.put("firstname",Staff.getFirstname());
            valueInsert.put("lastname",Staff.getLastname());
            valueInsert.put("gender",Staff.getGender());
            valueInsert.put("position",Staff.getPosition());
            valueInsert.put("shift",Staff.getShift());
            valueInsert.put("image",Staff.getPathImg());
            valueInsert.put("phone",Staff.getPhone());
            return valueInsert;
    }
    public void updateData(HashMap<String,Object> Map, String Condition){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Update("staff", Map, Condition);
        } catch (Exception ex) {
            Logger.getLogger(StaffBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertData(HashMap<String,Object> Map){
        try {
            myConnectUnit unit=new myConnectUnit();
            unit.Insert("staff", Map);
        } catch (Exception ex) {
            Logger.getLogger(ProductBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getLinkImage(int id) throws Exception{
            myConnectUnit unit=new myConnectUnit();
            String id_temp=" id= "+Integer.toString(id);
            ResultSet result=unit.Select("staff",id_temp );
            StaffDTO staff=new StaffDTO();
            while(result.next()){
                 staff=new StaffDTO(Integer.parseInt(result.getString("id")),result.getString("firstname"),result.getString("lastname"),Integer.parseInt(result.getString("gender")),Integer.parseInt(result.getString("phone")), result.getString("position"),Integer.parseInt(result.getString("shift")), result.getString("image"));
            }
            return staff.getPathImg() ;
    }
//    public static boolean checkValidPhoneNumber(String number){
//        return number.charAt(0)=='0'&& number.length()==9 && number.matches("[0-9+]");
//                
//    }
//    public boolean warningPhoneNumber(String number){
//        if(checkValidPhoneNumber(number)){
//            return true;
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "PhoneNumber is invalid !!!","Warning !!!",JOptionPane.YES_OPTION);
//            return false;
//        }
//    }
    public String getGender(int GenderId){
        if(GenderId==1)
            return "Men";
        if(GenderId==0)
            return "Women";
        return null;
    }
    public int getGenderId(String Gender){
        if(Gender.equals("Men"))
            return 1;
        if(Gender.equals("Women"))
            return 0;
        return -1;
    }
}
