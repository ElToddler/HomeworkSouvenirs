package MainClasses;

public class Souvenir {

    protected String souvenirName;
    protected String manufacturerName;
    protected Integer manufacturingDate;
    protected Double souvenirPrice;

    public void setSouvenirName(String souvenirName) {
        this.souvenirName = souvenirName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setManufacturingDate(Integer manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setSouvenirPrice(Double souvenirPrice) {
        this.souvenirPrice = souvenirPrice;
    }

    public String getSouvenirName() {
        return souvenirName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public Integer getManufacturingDate() {
        return manufacturingDate;
    }

    public Double getSouvenirPrice() {
        return souvenirPrice;
    }
    public String toString() {
        return  "Souvenir Name = " + souvenirName +
                "\n Manufacturer ='" + manufacturerName +
                "\n Production Date =" + manufacturingDate +
                "\n Price =" + souvenirPrice + "\n\n\n";
    }

}
