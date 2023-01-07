public class orderDetailsOfCustomer {

    String name;
    String address;
    int mobileNumber;
    int orderNumber;
    double price;

    public orderDetailsOfCustomer(String name, String address, int mobileNumber, int orderNumber, double price) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.orderNumber = orderNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return getOrderNumber()+","+getMobileNumber()+","+getName()+","+getAddress()+","+getPrice();
    }
}
