package practice06;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        /*
   Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
   girilen sayı dahil
  */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");


        int sayi=scanner.nextInt();

        int count=0;
        while (sayi>0){

            if (sayi%2==1){
                System.out.println(sayi);

                count++;

            }

            sayi--;

        }

        System.out.println("count = " + count );











    }







}
