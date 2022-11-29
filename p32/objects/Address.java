package objects;

public final class Address {
    private final String cityName, streetName;
    private final int zipCode, buildingNumber, apartmentNumber;
    private final char buildingLetter;
    public static final Address EMPTY_ADDRESS = new Address("","",0,0,0,' ');
    public Address(String cityName, String streetName, int zipCode, int buildingNumber, int apartmentNumber,
            char buildingLetter) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
    }
    public String getCityName() {
        return cityName;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getZipCode() {
        return zipCode;
    }
    public int getBuildingNumber() {
        return buildingNumber;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public char getBuildingLetter() {
        return buildingLetter;
    }
    @Override
    public String toString() {
        return "Address [cityName=" + cityName + ", streetName=" + streetName + ", zipCode=" + zipCode
                + ", buildingNumber=" + buildingNumber + ", apartmentNumber=" + apartmentNumber + ", buildingLetter="
                + buildingLetter + "]";
    }
    
}
