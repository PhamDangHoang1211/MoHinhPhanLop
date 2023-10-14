/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DTO;

/**
 *
 * @author Hung Tuong Vy
 */
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private int status;
    private int staffId;

    public UserDTO() {
    }

    public UserDTO(int id,String username, String password,int status, int StaffId) {
        this.id = id;
        this.username=username;
        this.password = password;
        this.status = status;
        this.staffId=StaffId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
