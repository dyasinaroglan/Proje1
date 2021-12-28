package proje1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DuzenliMetin {

    /*
    Girilen bir metnin kelimelerinin ilk harfini büyük diğer harflerini küçük yapan
    ve düzenlenmiş bu metni return eden metinDuzenle() isimli bir method yazın.

    Example 1:  input: " jAva  öGRENEbildiniz MI? "      output: "Java Ögrenebildiniz Mi?"
     */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String cümle = scanner.nextLine();
        System.out.println(metinDuzenle(cümle));
    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static String metinDuzenle(String metin){
        String[] array= metin.trim().replaceAll("[ ]+"," ").split(" ");
        // metin de sonunda ve başında boşluk varsa onları sil.(trim) köşeli parantezi sil array çünkü,onun yerine boşluk koy.
        // ve split et her boşluktan sonra böl.
        String text=" ";
        for (int i = 0; i < array.length; i++) {
            text+= String.valueOf(array[i].charAt(0)).toUpperCase()+array[i].substring(1).toLowerCase()+" ";
        }
        return text.trim();
    }
}
