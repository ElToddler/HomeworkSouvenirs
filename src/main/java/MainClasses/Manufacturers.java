package MainClasses;

public class Manufacturers {
 private String manufacturer;
 private String manufacturerCountry;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }
    public String toString() {
        return  "Manufacturer Name = " + manufacturer +
                "\n Country of Origin  ='" + manufacturerCountry + "\n\n\n";
    }
}
