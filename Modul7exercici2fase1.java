package modul7exercici2fase1;
public class Modul7exercici2fase1 {
public static void main(String[] args) {
    }
}

class Vehicle {
    protected String plateNombre;
    protected String plateChar;
    protected String brand;
    protected String color;
    protected String brandRodes;
    protected double diametre;
    
    public Vehicle(String plateNombre, String plateChar, String brand, String color) {
        this.plateNombre = plateNombre;
        this.plateChar = plateChar;
        this.brand = brand;
        this.color = color;
    }
    
    public Vehicle(String brandRodes, double diametre){
        this.brandRodes = brandRodes;
        this.diametre = diametre;
    }
    
    public void demanaNombre(String plateNombre)throws Exception{
        if(plateNombre.length() == 4){
            this.plateNombre = plateNombre;
        }else{
            throw new Exception();
        }
    }
    
    public String donaMatriculaNombre(){
        return  plateNombre;
    } 
    
    public void demanaLletres(String plateChar) throws Exception{
        if(plateChar.length() == 2 || plateChar.length() == 3){
            this.plateChar = plateChar;
        }else{
            throw new Exception();
        }
    }
    
    public String donaMatriculaChar(){
        return plateChar;
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
    
    public void prenBrandRodes(String brandRodes){
        this.brandRodes = brandRodes;
    }
    
    public String donaBrandRodes(){
        return brandRodes;
    }
    
    public void demanaDiametre(double diametre) throws Exception{
        if(diametre < 0.4 || diametre > 4){
            throw new Exception();
        }else{
            this.diametre = diametre;
        }
    }
    
    public double donaDiametre(){
        return diametre;
    }
}     
        
class Car extends Vehicle {
    public Car(String plateNombre, String plateChar, String brand, String color) {
            super(plateNombre, plateChar, brand, color);
    }
    public Car(String brandRodes, double diametre){
        super(brandRodes, diametre);
    }
}

class Bike extends Vehicle {
    public Bike(String plateNombre, String plateChar, String brand, String color) {
            super(plateNombre, plateChar, brand, color);
    }
    public Bike(String brandRodes, double diametre){
		super(brandRodes, diametre);
    }
}

class Camio extends Vehicle {
    public Camio(String plateNombre, String plateChar, String brand, String color) {
            super(plateNombre, plateChar, brand, color);
    }
    public Camio(String brandRodes, double diametre){
		super(brandRodes, diametre);
    }
}


    
    
        
    
    
    

