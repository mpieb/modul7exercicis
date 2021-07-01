package modul7exercici1fase1;
public class Modul7exercici1fase1 {
public static void main(String[] args) {
       Car nouVehicle = new Car("1234 GMT", "Alfa Mateu", "Blanc");
    System.out.println("El vehicle té matrícula: " + nouVehicle.donaMatricula() +
             ", de marca: " + nouVehicle.donaMarca() + ", i color: " +
            nouVehicle.donaColor());
    
    Wheel rodesTraseres = new Wheel("Parelli", 1.2);
    System.out.println("Les dues rodes traseres són de marca: " +
            rodesTraseres.donaMarca() + ", i tenen: " +
            rodesTraseres.donaDiametre() + " de diàmetre.");
    
    Wheel rodesDavanteres = new Wheel("Machelin", 1.4);
    System.out.println("Les dues rodes davanteres són de marca: " +
            rodesDavanteres.donaMarca() + ", i tenen: " +
            rodesDavanteres.donaDiametre() + " de diàmetre.");
    }
}

class Vehicle {
    protected String plate;
    protected String brand;
    protected String color;
    
    public Vehicle(String plate, String brand, String color) {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }
    
    public void prenMaTricula(String plate){
        this.plate = plate;
    }
        
    public String donaMatricula(){
        return plate;
    }
        
    public void prenMarca(String brand){
        this.brand = brand;
    }
        
    public String donaMarca(){
        return brand;
    }
        
    public void prenColor(String color){
        this.color = color;
    }
        
    public String donaColor(){
        return color;
    }
}     
        
class Car extends Vehicle {
    public Car(String plate, String brand, String color) {
            super(plate, brand, color);
    }
}

class Wheel {
    private String brand;
    private double diameter;

    public Wheel(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    
    public void prenMarca(String brand){
        this.brand = brand;
    }
    
    public String donaMarca(){
        return brand;
    }
    
    public void prenDiametre(double diameter){
        this.diameter = diameter;
    }
    
    public double donaDiametre(){
        return diameter;
    }
}

