package proje1;

import java.util.Scanner;

public class IkiStringBirlestir {
        /*
        Kullanıcıdan alınan iki adet Stringi birbirlerine ekle.
        Eger ilk kelimenin son harfi,
            ikinci kelimenin ilk harfi ile aynı ise
        aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                     012 --> 3
                    "abc", "dog"  -->"abcdog"
         */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kelimeyi girin");
        String kelime1 = scanner.nextLine();
        System.out.println("2.kelimeyi giriniz");
        String kelime2 = scanner.nextLine();
        String birleştirilmiş ="";

        if(kelime1.charAt(kelime1.length()-1) == kelime2.charAt(0)){
         birleştirilmiş = kelime1.concat(kelime2.substring(1));
        }
        else {
            birleştirilmiş = kelime1.concat(kelime2);
        }
        System.out.println(birleştirilmiş);
    }
}
