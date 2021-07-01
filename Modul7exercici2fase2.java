package modul7exercici2fase2;

import java.util.*;

public class Modul7exercici2fase2 {
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
    





    
    
    

