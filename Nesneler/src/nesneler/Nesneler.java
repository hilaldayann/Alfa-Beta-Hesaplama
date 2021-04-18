/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneler;

import java.io.FileNotFoundException;

/**
 *
 * @author Hilal
 */
public class Nesneler {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Alfa list = new Alfa();
        list.dosyayaYaz();
        list.dosyayıOkuu();
        Beta listt = new Beta();
        listt.dosyayaYaz();
        listt.dosyayıOkuu();
//        System.out.println("Oluşturulan Alfa Object Sayısı : " + sayac1);
//        System.out.println("Oluşturulan Beta Object Sayısı : " + sayac2);
    }
}
