package se.lexicon.model;


interface VendingMachine {

    void addCurrency(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j);
    void getBalance();
    Product request();
    int endSession();
    String getDescription();
    String[] getProducts();





























}
