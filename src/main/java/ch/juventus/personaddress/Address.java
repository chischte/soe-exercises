package ch.juventus.personaddress;

public class Address {
    private String streetName;
    private String cityName;

    public void setAddress(String streetName, String cityName) {
        this.streetName = streetName;
        this.cityName = cityName;
    }

    public String getAddress() {
        String addressInfo = this.streetName + " " + this.cityName;
        return addressInfo;
    }

}
