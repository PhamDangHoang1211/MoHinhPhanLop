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

public class MiniProductDTO {
    private String name;
    private String Size;
    private int price;
    private int qty;
    private String Barcode;
    private int Category_id;
    public MiniProductDTO() {
    }

    public MiniProductDTO(String name, String Size, int price, int qty, String Barcode, int Category_id) {
        this.name = name;
        this.Size = Size;
        this.price = price;
        this.qty = qty;
        this.Barcode = Barcode;
        this.Category_id = Category_id;
    }

    
    public MiniProductDTO(String name, String Size, int price, int qty, String Barcode) {
        this.name = name;
        this.Size = Size;
        this.price = price;
        this.qty = qty;
        this.Barcode = Barcode;
    }

    public int getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(int Category_id) {
        this.Category_id = Category_id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }
    
    
}
