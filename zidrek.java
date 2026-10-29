/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livecoding;

/**
 *
 * @author LENOVO LOQ
 */
public class zidrek {

    public static void main(String[] args) {

        //  Odd or Even
        int zidrek = oddEven(15);
        System.out.println("Problem 1: " + zidrek);

        // Triangle Classification
        System.out.println("Problem 2:");
        System.out.println(classifyTriangle(5, 5, 5)); // Equilateral
        System.out.println(classifyTriangle(5, 5, 3)); // Isosceles
        System.out.println(classifyTriangle(4, 5, 6)); // Scalene
        System.out.println(classifyTriangle(1, 2, 3)); // Invalid
    }

    // Odd or Even
    public static int oddEven(int zidrek) {
        if ( zidrek % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //  Triangle Classification
    public static int classifyTriangle(int a, int b, int c) {

        // Check if the sides are positive
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }

        // Check if the sides form a valid triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        // Check the type of triangle
        if (a == b && b == c) {
            return 1;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 3;
        }
    }
}
    

