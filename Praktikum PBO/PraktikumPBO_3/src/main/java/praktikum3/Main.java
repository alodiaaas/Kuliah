/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda", "Brio Satya 1.2 E", 2018, "Putih");
        Mobil mobil2 = new Mobil("Toyota", "Supra MK4 2JZ-GTE Turbo", 1998, "Hitam");
        
        System.out.println("Mobil 1");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        System.out.println("\nMobil 2");
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}
