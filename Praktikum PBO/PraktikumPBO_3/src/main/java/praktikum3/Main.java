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
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2018, "Putih");
        
        System.out.println("Mobil 1");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        System.out.println("\nMobil 2");
        mobil2.displayInfo();
        mobil2.startEngine();

        mobil1.setWarna("Merah");
        System.out.println("\nWarna setelah diubah:");
        mobil1.displayInfo();
    }
}
