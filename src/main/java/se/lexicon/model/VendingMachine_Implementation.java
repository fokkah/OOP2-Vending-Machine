package se.lexicon.model;



public class VendingMachine_Implementation implements VendingMachine{

    Product[]   products;
    int         depositPool;

    //--------------- CONSTRUCTOR --------------

    public VendingMachine_Implementation(Product[] products) {
        this.products = products;
    }

    //-------------- SETTERS --------------------

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }




    @Override
    public void addCurrency(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        this.addCurrency(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);

    }

    @Override
    public void getBalance() {

    }

    @Override
    public Product request() {

        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "test";
    }

    @Override
    public String[] getProducts() {
        return new String[ 0 ];
    }
}
