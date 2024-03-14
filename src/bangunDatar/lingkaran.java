/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author Othman Satria
 */
public class lingkaran {
    // atributes
    double  r; // jari jari
    
    // constructor
    public lingkaran(double r){
        this.r = r;
    }

    // method
    public double keliling () {
        return 2 * Math.PI * r;
    }
    public double luas (){
        return Math.PI * r * r;
    }
}
