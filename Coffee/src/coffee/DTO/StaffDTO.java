/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DTO;

import java.io.InputStream;

/**
 *
 * @author Hung Tuong Vy
 */
public class StaffDTO {
    private int id;
    private String firstname;
    private String lastname;
    private int gender;
    private int phone;
    private String position;
    private int shift;
    private String pathImg;
    private InputStream is;
    public StaffDTO() {
    }

    public StaffDTO(String firstname, String lastname, int gender, int phone, String position, int shift, InputStream is) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.position = position;
        this.shift = shift;
        this.is = is;
    }

    
    public StaffDTO(String firstname, String lastname, int gender,int phone, String position, int shift, String pathImg) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone=phone;
        this.position = position;
        this.shift = shift;
        this.pathImg = pathImg;
    }

    public StaffDTO(int id, String firstname, String lastname, int gender, int phone, String position, int shift, String pathImg) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.position = position;
        this.shift = shift;
        this.pathImg = pathImg;
    }


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }
    
}
