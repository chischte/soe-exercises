package ch.juventus.compare;

public class Address {
    private String streetName;
    private String cityName;

    public Address(String streetName, String cityName) {
        setStreetName(streetName);
        setCityName(cityName);
    }

    public String getAddress() {
        String addressInfo = this.streetName + " " + this.cityName;
        return addressInfo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
