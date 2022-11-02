package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        //Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        //Not: Problemi, Grup2_Homeworks projesi içerisine day20 package'ı açıp, MaxMin sınıfı oluşturarak çözünüz.


        int largest;
        int smallest;
        int[] num = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length ; i++) {
            System.out.print("Enter the numbers : ");
            num[i] = input.nextInt();
        }
        largest = num[0];
        smallest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i]<smallest){
                smallest=num[i];
            }
            if (num[i]>largest) {
                largest=num[i];
            }
        }
        System.out.println("The largest number : "+largest);
        System.out.println("The smallest number : "+smallest);
        }
}
