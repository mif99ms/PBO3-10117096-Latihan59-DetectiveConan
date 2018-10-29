/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan59.detectiveconan;

/**
 *
 * @author 
 * Nama         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * Kelas        : PBO 3
 * Deskripsi    : Program ini berisi program untuk menampilkan karakter dari 
 * anime detective conan
 */
public class PBO310117096Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainCharacter conan = new MainCharacter("Investigator", 
                "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        MainCharacter ran = new MainCharacter("Karate", "Sama seperti Shinichi",
                "Ran Mouri","Osaka",false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri",
                "Eisuke Hondo","Osaka",false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }
    
}
