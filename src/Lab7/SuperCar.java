package Lab7;

public class SuperCar {
    private String brand;
    private String color;
    private String engineSize;
    private String maxSpeed;
    private String countryOrigin;

    public SuperCar(){
        this.brand = brand;
        this.color = color;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
        this.countryOrigin = countryOrigin;
    }

    public SuperCar(String cb, String cc, String es, String ms, String co) {
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String newbrand){
        this.brand = newbrand;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String newcolor){
        this.color = color;
    }

    public String getEngineSize(){
        return this.engineSize;
    }
    public void setEngineSize(String newengineSize){
        this.engineSize = newengineSize;
    }

    public String getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(String newmaxSpeed){
        this.maxSpeed = newmaxSpeed;
    }

    public String getCountryOrigin(){
        return this.countryOrigin;
    }
    public void setCountryOrigin(String newcountryOrigin){
        this.countryOrigin = newcountryOrigin;
    }

    public void getsupercarinfo(){
        System.out.print(brand+color+engineSize+maxSpeed+countryOrigin);
    }

}
