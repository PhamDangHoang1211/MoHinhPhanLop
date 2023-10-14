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
public class CartDTO {
    private String Date;
    private String Barcode;
    private String ProductName;
    private String Size;
    private int qty;
    private int total;
    private String Note;

    public CartDTO() {
    }

    public CartDTO(String Date, String Barcode, String ProductName, String Size, int qty, int total, String Note) {
        this.Date = Date;
        this.Barcode = Barcode;
        this.ProductName = ProductName;
        this.Size = Size;
        this.qty = qty;
        this.total = total;
        this.Note = Note;
    }

    
    public CartDTO(String Barcode, String ProductName, String Size, int qty, int total, String Note) {
        this.Barcode = Barcode;
        this.ProductName = ProductName;
        this.Size = Size;
        this.qty = qty;
        this.total = total;
        this.Note = Note;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    
    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
    
}
