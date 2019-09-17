package Lab7;

public class SuperCar {
    private String brand;
    private String color;
    private String engineSize;
    private String maxSpeed;
    private String countryOrigin;

    public SuperCar(String brand, String color, String engineSize, String maxSpeed, String countryOrigin) {
        this.brand = brand;
        this.color = color;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
        this.countryOrigin = countryOrigin;
    }


    public String getsupercarinfo() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
