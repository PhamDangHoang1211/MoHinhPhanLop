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
public class ProductDTO {
    private int id;
    private String name;
    private String Description;
    private int CategoryType;
    private int Size;
    private int price;
    private int qty;
    private String Barcode;
    private int Status;

    public ProductDTO() {
    }

    public ProductDTO(
            String name, 
            String Description, 
            int CategoryType, 
            int Size, 
            int price, 
            int qty, 
            String Barcode, 
            int Status
        ) {
        this.name = name;
        this.Description = Description;
        this.CategoryType = CategoryType;
        this.Size = Size;
        this.price = price;
        this.qty = qty;
        this.Barcode = Barcode;
        this.Status = Status;
    }

    public ProductDTO(int id,String name, String Description, int CategoryType, int Size, int price, int qty, String Barcode, int Status) {
        this.id=id;
        this.name = name;
        this.Description = Description;
        this.CategoryType= CategoryType;
        this.Size = Size;
        this.price = price;
        this.qty = qty;
        this.Barcode = Barcode;
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCategoryType() {
        return CategoryType;
    }

    public void setCategoryType(int CategoryType) {
        this.CategoryType = CategoryType;
    }

   

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
