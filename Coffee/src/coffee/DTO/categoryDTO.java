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
public class categoryDTO {
// khai báo các thuộc tính
    private int id;
    private int status;
    private String cate_name;
    
// contructor
    public categoryDTO() {
    }

    public categoryDTO(int id, int status, String cate_name) {
        this.id = id;
        this.status = status;
        this.cate_name = cate_name;
    }
// hàm get/set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }
    
    
}
