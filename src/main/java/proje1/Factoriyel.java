package proje1;

import java.util.Scanner;

public class Factoriyel {

    /*
        Girilen pozitif bir sayının faktöriyel değerini bulmak için bir program yazın.
        Sayı negatif girilirse 0 yazsın

        number : 5     ise  (factorial : 1*2*3*4*5=120)
        output : 120

    */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        int carpım = 1;
        if(sayı>-1) {
            for (int i = 1; i <= sayı; i++) {
                carpım = i * carpım;
            }
        }
        else {
            carpım=0;
        }
        System.out.println("sonuç:" + carpım);
    }
}
