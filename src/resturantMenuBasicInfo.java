public class resturantMenuBasicInfo {

    String dishName;
    double price;

    public resturantMenuBasicInfo(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return getDishName()+","+getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
