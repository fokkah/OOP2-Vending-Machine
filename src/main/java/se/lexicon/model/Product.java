package se.lexicon.model;

class Product  {

    public String productName;
    public double price;
    public int id;
    public String examine;


    public Product(String name, double price, String examine, int id) {
        this.productName = name;
        this.price = price;
        this.id = id;
        this.examine = examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExamine() {
        return examine;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
