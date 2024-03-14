/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.segitiga;

/**
 *
 * @author Othman Satria
 */
public class limasSegitiga extends segitiga implements hitungBangunRuang  {
    double tinggiLimas;
    public limasSegitiga (double alas, double tinggi, double tinggiLimas) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLimas;
    }
    @Override
    public double volume () {
        return (1.0/3) * super.luas() * tinggiLimas;
    }
    @Override
    public double luasPermukaan () {
        return 2 * super.luas() + super.keliling() * tinggiLimas;
    }
}
