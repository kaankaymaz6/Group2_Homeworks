package day11;

import java.util.Scanner;

public class Dortgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Square Side: ");
        int side = input.nextInt();
        System.out.print("Rectangle Long Side: ");
        int longSide = input.nextInt();
        System.out.print("Rectangle Short Side: ");
        int shortSide = input.nextInt();

        int squareSArea = areaCalculate(side, side);
        int rectangleArea = areaCalculate(longSide, shortSide);

        int squarePerimeter = perimeterCalculate(side, side);
        int rectanglePerimeter = perimeterCalculate(longSide, shortSide);


        int totalArea = squareSArea + rectangleArea;
        int totalPerimeter = squarePerimeter + rectanglePerimeter;
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);

    }

    public static int areaCalculate(int side1, int side2) {
        return side1 * side2;
    }

    public static int perimeterCalculate(int side1, int side2) {
        return (side1 + side2) * 2;
    }

}
