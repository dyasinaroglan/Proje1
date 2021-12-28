package proje1;

import java.util.Scanner;

public class RandomNum {
     /*

    Girilen 2 integer arasında Random integer sayı üreten programı yazınız.
    not : girilen sayı üretilen sayılara dahil olmalıdır

  */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();

        int min = Math.min(sayı1,sayı2);
        int max = Math.max(sayı1,sayı2);

        int random = min+ (int) Math.random()*(max-min)+1;
        System.out.println(random);
            }
        }