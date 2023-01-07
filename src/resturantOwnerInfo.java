public class resturantOwnerInfo extends basicLoginInfo{

    String hotelName;

    public resturantOwnerInfo(String userName, String password, String hotelName) {
        super(userName, password);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString(){
        return getUserName()+","+getPassword()+","+getHotelName();
    }
}
