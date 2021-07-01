package modul7exercici1fase3;

import java.util.Scanner;

public class Modul7exercici1fase3 {
    public static void main(String[] args) {
        System.out.println("Quin tipus de vehicle vols?");
        System.out.println("1. Car");
        System.out.println("2. Bike");
    
    Scanner lector = new Scanner(System.in);
    
    int decisio = lector.nextInt();
    
    if (decisio == 1){
        Car nouCotxe = new Car("1234", "HOT", "Sireres", "Blanc");
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
        
        Car nouCotxeRodesDarrere = new Car("Parelli", 2.2);
        try{
        nouCotxeRodesDarrere.demanaDiametre(1.2);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes traseres són de marca: " +
            nouCotxeRodesDarrere.donaMarca() + ", i tenen: " +
            nouCotxeRodesDarrere.donaDiametre() + " de diàmetre.");
        
        Car nouCotxeRodesDavant =new Car("Machelin", 1.9);
        try{
        nouCotxeRodesDavant.demanaDiametre(1.2);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes davanteres són de marca: " +
            nouCotxeRodesDavant.donaMarca() + ", i tenen: " +
            nouCotxeRodesDavant.donaDiametre() + " de diàmetre.");
    }else{
        Bike novaMoto = new Bike("9876", "MOT", "Magneti Marilli", "Negre");
        try{
        novaMoto.demanaNombre("2345");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
        }
        try{
        novaMoto.demanaLletres("GMT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
        }
        
        System.out.println("La moto té matrícula: " + novaMoto.donaMatriculaNombre() +
            " " + novaMoto.donaMatriculaChar() + ", de marca: " +
             novaMoto.donaMarca() + ", i color: " + novaMoto.donaColor());
        
        Bike novaMotoRodesDarrere = new Bike("Machelin", 0.9);
        try{
        novaMotoRodesDarrere.demanaDiametre(1.2);
        }catch(Exception e){
        System.out.println("El diàmetre de la roda del darrere ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes traseres són de marca: " +
            novaMotoRodesDarrere.donaMarca() + ", i tenen: " +
            novaMotoRodesDarrere.donaDiametre() + " de diàmetre.");
        
        Bike novaMotoRodesDavant = new Bike("Machelin", 0.7);
        try{
        novaMotoRodesDavant.demanaDiametre(1.4);
        }catch(Exception e){
            System.out.println("El diàmetre de la roda del davant ha de ser major de 0,4 i menor de 4");
        }
    
        System.out.println("Les dues rodes davanteres són de marca: " +
            novaMotoRodesDavant.donaMarca() + ", i tenen: " +
            novaMotoRodesDavant.donaDiametre() + " de diàmetre.");
        }
    lector.close();
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
    public Car(String plateNombre, String plateChar, String brand, String color){
            super(plateNombre, plateChar, brand, color);
    }
    public Car(String brandRodes, double diametre){
        super(brandRodes, diametre);
    }
}

class Bike extends Vehicle {
    public Bike(String plateNombre, String plateChar, String brand, String color){
            super(plateNombre, plateChar, brand, color);
    }
    public Bike(String brandRodes, double diametre){
		super(brandRodes, diametre);
    }
}

    
    
        
    
    
    









    
        
    
