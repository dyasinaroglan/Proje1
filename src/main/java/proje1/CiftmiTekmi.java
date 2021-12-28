package proje1;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CiftmiTekmi {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        if(sayı%2==0){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

}
