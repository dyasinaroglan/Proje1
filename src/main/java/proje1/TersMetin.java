package proje1;

import java.util.Scanner;

public class TersMetin {

    /*
    Girilen bir metnin tersini ekrana yazdırınız.

    Example 1:  input: Turkiye       output: eyikruT
     */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scanner.nextLine();  //next tek kelime nextLine komple satırı alır

        String ters ="";

        for (int i = kelime.length()-1; i >=0; i--) {  //neden lengt()-1 yaptık. m u s t a f a
                                                                               //0 1 2 3 4 5 6
                                                                               //ancak mustafa 7 harften oluşuyor. o yüzden -1
            ters= ters+kelime.charAt(i);
        }
        System.out.println("girdiğiniz metnin tersi:\n"+ ters);


    }

}
