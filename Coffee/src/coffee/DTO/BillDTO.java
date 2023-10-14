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
public class BillDTO {
    private int id;
    private String date;
    private int total;
    public BillDTO() {
    }

    public BillDTO(int id, String date,int total) {
        this.id = id;
        this.date = date;
        this.total=total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
