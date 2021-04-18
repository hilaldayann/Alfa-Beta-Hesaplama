/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Hilal
 */
class Alfa {
     public void dosyayaYaz(){
        int sonuc;
        int sonuc2 = 0;
        int sayac1 = 0;
        File dosya=new File("nesneler.txt");
        PrintWriter cikti=null;
        Scanner klavye=new Scanner(System.in);
        try 
        {
            if(!dosya.exists()) dosya.createNewFile();
            else
            {
                cikti=new PrintWriter(dosya);
                    int deger1 = klavye.nextInt();
                    int deger2 = klavye.nextInt();
                    sonuc=deger1*deger2;
                    cikti.println("A : "+" "+deger1+" "+deger2);
                    cikti.println("Alfa : "+ sonuc );
                    sonuc2 += sonuc;
                }
                cikti.close();
                sayac1++;
                System.out.println("Oluşturulan Alfa Object Sayısı : " + sayac1);
                System.out.println("Alfa Toplam : " + sonuc2);
        }
        catch(Exception e)
        {
            System.out.println("Bir Hata İle Karşılaşıldı.");
        }
    }
      public void dosyayıOkuu() throws FileNotFoundException {
        try{
            String okunan = null;
            File dosyaAdi = new File("nesneler.txt");
            Scanner okuyucu = new Scanner(dosyaAdi);
            
            while(okuyucu.hasNextLine())
            {
                okunan = okuyucu.nextLine();
                System.out.println(okunan);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Bir hata ile karşılaşıldı.");
            e.printStackTrace();
        }
    }
}
