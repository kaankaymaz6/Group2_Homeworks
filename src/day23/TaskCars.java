package day23;

import java.util.Random;
import java.util.Scanner;

public class TaskCars {
    public static void main(String[] args) {
        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        Random rnd=new Random();
        int price=0;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i+" = "+cars[i]);
        }
        System.out.print("Your choice : ");
        int choice=input.nextInt();
        if (choice>=0 & choice<=3){
            price=rnd.nextInt(20000,40000);
        } else if (choice>=4 & choice<=5) {
            price=rnd.nextInt(50000,80000);
        }else {
            price=rnd.nextInt(100000,150000);
        }
        System.out.printf("Your choice's %s price = %d. Enjoy the ride.",cars[choice],price);
    }
}
