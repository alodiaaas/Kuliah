/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) { 
        Kucing kucing = new Kucing(); 
        kucing.nama = "Kitty"; 
        kucing.jenis = "Persian"; 
        kucing.suara = "Meong"; 
        kucing.tampilkanInfo(); 
        
        System.out.println();
 
        Anjing anjing = new Anjing(); 
        anjing.nama = "Puppy"; 
        anjing.jenis = "Siberian Husky"; 
        anjing.suara = "Woof"; 
        anjing.tampilkanInfo(); 
    } 
}
