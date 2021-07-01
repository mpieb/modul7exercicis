package modul7exercici2fase3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Modul7exercici2fase3 {
public static void main(String[] args) {
    TitularVehicle nouTitular = new TitularVehicle("Pere", "Xufré", "Baqué", 1999, 11, 04);
    TitularVehicle nouTitularExtra = new TitularVehicle("Si", "No");
    
    Llicencia crearVehicle =new Llicencia("1234", "Cotxe", "Pere Xufré Baqué", "28/01/2030");
        try{
        crearVehicle.prenTipusLlicencia("cotxe");
        }catch(Exception e){
            System.out.println("La llicencia ha de ser de cotxe, bike o camió per poder crear vehicle!");
            }
        
    System.out.println("El titular del vehicle serà el conductor?");
        System.out.println("1. Si");
        System.out.println("2. No");
    
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
        Conductor nouConductor = new Conductor("Pau", "Riba", "Tona", 1999, 9, 04);
        Llicencia nouConductorLlicencia = new Llicencia("2345", "Cotxe", "Pau Riba Tona", "23/05/2030");
        try{
        nouConductorLlicencia.prenTipusCar("cotxe");
        }catch(Exception e){
            System.out.println("La llicencia ha de ser de cotxe per el vehicle creat!");
            }
        }
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

class TitularVehicle {
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private Date dataNeixement;
    private String assegurança;
    private String garatgePropi;
    
    public TitularVehicle(String nom, String primerCognom, String segonCognom, int agno, int mes, int dia){
        this.nom = nom;
        this.primerCognom = primerCognom;
        this.segonCognom = segonCognom;
        
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        dataNeixement = calendario.getTime();
    }
    
    public TitularVehicle(String assegurança, String garatgePropi){
        this.assegurança = assegurança;
        this.garatgePropi = garatgePropi;
    }
    
    public void prenNom (String nom){
        this.nom = nom;
    }
    
    public String donaNom(){//Getter
        return nom;
    }
    
    public void prenPrimerCognom(String primerCognom){
        this.primerCognom = primerCognom;
    }
    
    public String donaPrimerCognom(){
        return primerCognom;
    }
    
    public void prenSegonCognom(String segonCognom){
        this.segonCognom = segonCognom;
    }
    
    public String donaSegonCognom(){
        return segonCognom;
    }
    
    public void prenDataNeixement(Date dataNeixement){
        this.dataNeixement = dataNeixement;
    }
    
    public Date donaDataNeixement(){
        return dataNeixement ;
    }
    
    public void prenAssegurança(String assegurança){
        this.assegurança = assegurança;
    }
    
    public String donaAssegurança(){
        return assegurança;
    }
    
    public void prenGaratgePropi(String garatgePropi){
        this.garatgePropi = garatgePropi;
    }
    
    public String donaGaratgePropi(){
        return garatgePropi;
    }
}

class Llicencia {
    private String id;
    private String tipusLlicencia;
    private String nomComplet;
    private String dataCaducitat;
    private String tipusLlicenciaCar;
    private String tipusLlicenciaBike;
    private String tipusLlicenciaCamio;
    
    public Llicencia(String id, String tipusLlicencia, String nomComplet, String dataCaducitat){
        this.id = id;
        this.tipusLlicencia = tipusLlicencia;
        this.nomComplet = nomComplet;
        this.dataCaducitat = dataCaducitat;
    }
    
    public void prenId (String id){
        this.id = id;
    }
    
    public String donaId(){
        return id;
    }
    
    public void prenNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
    
    public String donaNomComplet(){
        return nomComplet;
    }
    
    public void prenTipusLlicencia(String tipusLlicencia)throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("cotxe") || tipusLlicencia.equalsIgnoreCase("bike")
                || tipusLlicencia.equalsIgnoreCase("Camió")){
            this.tipusLlicencia = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String donaLlicencia(){
        return tipusLlicencia;
    }
    
    public void prenTipusCar(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("cotxe")){
            this.tipusLlicenciaCar = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String donaTipusCar(){
        return tipusLlicenciaCar;
    }
    
    public void tipusLlicenciaBike(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("bike")){
            this.tipusLlicenciaBike = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String donaTipusBike(){
        return tipusLlicenciaBike;
    }
    
    public void tipusLlicenciaCamio(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("camio")){
            this.tipusLlicenciaCamio = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String donaTipusCamio(){
        return tipusLlicenciaCamio;
    }
    
    public void prenDataCaducitat(String dataCaducitat){
        this.dataCaducitat = dataCaducitat;
    }
    
    public String donaDataCaducitat(){
        return dataCaducitat;
    }
}

class Conductor extends TitularVehicle {
    public Conductor(String nom, String primerCognom, String segonCognom, int agno, int mes, int dia){
        super(nom, primerCognom, segonCognom, agno, mes, dia);
    }
}
    





    
    
