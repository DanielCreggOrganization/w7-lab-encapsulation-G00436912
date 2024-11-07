package ie.atu.encapsulation;

public class Temperature {
    private double celsius;

    public double getCelsius(){
        return celsius;
    }
    public void setCelsius(double celsius){
        this.celsius = celsius;
    }
    public double getFahrenheit(){
        return(celsius * 9/5) + 32;

    }
}

//Main class to test Temperature

