public class SalariedProduct extends Employee {
    private double products;
    private double price = 10000;
    public SalariedProduct(String name, String noKTP, double products) {
        super(name, noKTP);
        setProducts(products);
    }
    public double getProducts() {
        return products;
    }
    public void setProducts(double products) {
        this.products = products;
    }
    public double getPrice() {
        return price;
    }
    public double getWeeklySalary() {
        return getPrice() * getProducts();
    }
    @Override
    public double earnings() {
        return getWeeklySalary() * 4;
    }
    @Override
    public String toString() {
        return String.format("Salaried Product: " + super.toString() + "\nWeekly Salary: " + getWeeklySalary());
    }
}
