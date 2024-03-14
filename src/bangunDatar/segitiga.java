/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Othman Satria
 */
public class segitiga {
    //atributes
    double alas,tinggi;
    
    //constructor
    public segitiga (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    //method
    public double luas() {
        return alas * tinggi / 2;
    }
    public double keliling() {
        double Pytagoras = Math.sqrt((1/2*(alas) * 1/2*(alas) + (tinggi * tinggi)));
        return (2 * Pytagoras) + alas;
       
    }
}
