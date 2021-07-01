package modul7exercici1fase2;
public class Modul7exercici1fase2 {
public static void main(String[] args) {
        Car nouCotxe = new Car("2345", "GMT", "Alfa Mateu", "Blanc");
    try{
    nouCotxe.demanaNombre("2345");
    }catch(Exception e){
        System.out.println("S´han de possar cuatre nombres enters!");
    }
    
    try{
    nouCotxe.demanaLletres("GMT");   
    }catch(Exception e){
        System.out.println("S´han de possar dos o tres lletres majúscules");
    }
    
    System.out.println("El cotxe té matrícula: " + nouCotxe.donaMatriculaNombre() +
            " " + nouCotxe.donaMatriculaChar() + ", de marca: " +
             nouCotxe.donaMarca() + ", i color: " + nouCotxe.donaColor());
    
    Wheel rodesTraseres = new Wheel("Parelli", 1.2);
    try{
        rodesTraseres.demanaDiametre(1.2);
    }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
    }
    System.out.println("Les dues rodes traseres són de marca: " +
            rodesTraseres.donaMarca() + ", i tenen: " +
            rodesTraseres.donaDiametre() + " de diàmetre.");
    
    Wheel rodesDavanteres = new Wheel("Machelin", 1.4);
    try{
        rodesDavanteres.demanaDiametre(1.4);
    }catch(Exception e){
        System.out.println("El diàmetre de les rodes davanteres ha de ser major de 0,4 i menor de 4");
    }
    System.out.println("Les dues rodes davanteres són de marca: " +
            rodesDavanteres.donaMarca() + ", i tenen: " +
            rodesDavanteres.donaDiametre() + " de diàmetre.");
   
    }
}

class Vehicle {
    protected String plateNombre;
    protected String plateChar;
    protected String brand;
    protected String color;
    
    public Vehicle(String plateNombre, String plateChar, String brand, String color) {
        this.plateNombre = plateNombre;
        this.plateChar = plateChar;
        this.brand = brand;
        this.color = color;
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
}     
        
class Car extends Vehicle {
    public Car(String plateNombre, String plateChar, String brand, String color) {
            super(plateNombre, plateChar, brand, color);
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
    
    public void demanaDiametre(double diameter) throws Exception{
        if(diameter < 0.4 || diameter > 4){
            throw new Exception();
        }else{
            this.diameter = diameter;
        }
    }

    public double donaDiametre(){
        return diameter;
    }
}







