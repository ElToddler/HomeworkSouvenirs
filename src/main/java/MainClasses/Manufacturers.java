package MainClasses;

public class Manufacturers {
 private String manufacturerName;
 private String manufacturerCountry;

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }
    public String toString() {
        return  "Manufacturer Name = " + manufacturerName +
                "\n Country of Origin  ='" + manufacturerCountry + "\n\n\n";
    }
}
