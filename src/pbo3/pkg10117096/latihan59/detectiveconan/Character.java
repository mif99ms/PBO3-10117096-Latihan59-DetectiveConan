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

 */
public class Character {
     protected String name;
    protected String from;
    protected boolean eyeglasses;
    
    public Character(String name, String from, boolean eyeglasses) {
        this.name = name;
        this.from = from;
        this.eyeglasses = eyeglasses;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
}
