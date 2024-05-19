public class Invoice implements Payable{
    private String productName;
    private int quantity;
    private int pricePerltem;

    public Invoice (String productName, int quantity, int pricePerltem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerltem = pricePerltem;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPricePerltem() {
        return pricePerltem;
    }
    public void setPricePerltem(int pricePerltem) {
        this.pricePerltem = pricePerltem;
    }
    @Override
    public double getPayableAmount() {
        return pricePerltem * quantity;
    }
    
}
