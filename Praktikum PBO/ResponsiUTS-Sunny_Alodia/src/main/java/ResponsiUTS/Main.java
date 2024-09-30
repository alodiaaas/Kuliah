/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Objek Produk
        Produk laptop = new Elektronik("Laptop", 9000000, 2);
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");

        // Objek Pegawai
        Pegawai sunny = new PegawaiTetap("Sunny", 5000000, 1000000);
        Pegawai alodia = new PegawaiKontrak("Alodia", 3000000, 12);

        // Output Polimorfisme
        System.out.println("Output Produk:");
        laptop.tampilkanInfo();
        System.out.println();
        
        System.out.println("Output Pegawai:");
        sunny.tampilkanInfo();
        System.out.println();
       
        System.out.println("Output Polimorfisme:");
        snack.tampilkanInfo();
        System.out.println();
        alodia.tampilkanInfo();
    }
}