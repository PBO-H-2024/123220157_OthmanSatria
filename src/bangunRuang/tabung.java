/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.lingkaran;

/**
 *
 * @author Othman Satria
 */
public class tabung extends lingkaran implements hitungBangunRuang{
    double tinggiTabung;

    public tabung (double r, double tinggiTabung) {
        super(r); 
        this.tinggiTabung = tinggiTabung;
        
    }
    @Override
    public double volume (){
        return super.luas() * tinggiTabung;
    }
    @Override
    public double luasPermukaan (){
        return 2 * super.luas() + super.keliling() * tinggiTabung;
    }
}
