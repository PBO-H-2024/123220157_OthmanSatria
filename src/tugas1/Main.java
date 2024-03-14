/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import bangunRuang.*;
import java.util.Scanner;
/**
 *
 * @author Othman Satria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("----------------");
            System.out.println("Welcome Sattt!!!");
            System.out.println("----------------");
            System.out.println("1. Limas segitiga");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");
            System.out.println("Pilih Gais : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1 -> {
                    hitungLimas(input);
                    backmenu(input);
                }
                case 2 -> {
                    hitungTabung(input);
                    backmenu(input);
                }
                case 3 -> {
                    input.close();
                    System.out.println("Bye wakk cikkk, have a nice dayyy!!!");
                    break OUTER;
                }
                default -> {
                }
            }
        }
    }

    public static void backmenu(Scanner scanner) {
        System.out.println("Press enter to go back to main menu");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void hitungLimas(Scanner scanner) {
        System.out.println("~~~Input~~~");
        System.out.println("Masukkan tinggi alasnya  : ");
        double tinggiAlas = scanner.nextDouble();
        System.out.println("Masukkan alasnya         : ");
        double alas = scanner.nextDouble();
        System.out.println("Masukkan tinggi limasnya : ");
        double tinggiLimas = scanner.nextDouble();

        System.out.println("===========================");
        System.out.println("       ~~~Result~~~"        );
        System.out.println("===========================");
        limasSegitiga limas = new limasSegitiga(alas, tinggiAlas, tinggiLimas);
        System.out.println("Luas segitiga            : " + limas.luas());
        System.out.println("Keliling segitiga        : " + limas.keliling());
        System.out.println("Volume limas             : " + limas.volume());
        System.out.println("Luas permukaan limas     : " + limas.luasPermukaan());
        System.out.println("---------------------------");

    }

    public static void hitungTabung(Scanner scanner) {
         System.out.println("~~~Input~~~");
         System.out.println("Masukkan jari jari    : ");
         double jari = scanner.nextDouble();
         System.out.println("Masukkan tinggi       : ");
         double tinggi = scanner.nextDouble();
         
         System.out.println("========================");
         System.out.println("      ~~~Result~~~"      );
         System.out.println("========================");
         tabung tabungg = new tabung(jari, tinggi);
         System.out.println("Luas Lingkaran        : " + tabungg.luas());
         System.out.println("Keliling Lingkaran    : " + tabungg.keliling());
         System.out.println("Volume tabung         : " + tabungg.volume());
         System.out.println("Luas permukaan tabung : " + tabungg.luasPermukaan());
         System.out.println("------------------------");
    }
}
