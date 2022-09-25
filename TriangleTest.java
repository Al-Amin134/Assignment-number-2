/**
 * The main Class
 */

/**
 * The header file for scan something
 */

import java.util.Scanner;


public class TriangleTest
{

    /**
     * Main methode;
     * @param args
     */
    public static void main(String[] args)
    {

        /**
         * Initialization
         */
        double x1,y1,x2,y2,x3, y3;
        Scanner input = new Scanner(System.in);
        /**
         * Input x1,y1,x2,y2,x3,y3.
         */
        System.out.println("Enter the value of x1");
        x1=input.nextDouble();

        System.out.println("Enter the value of y1");
        y1=input.nextDouble();

        System.out.println("Enter the value of x2");
        x2=input.nextDouble();

        System.out.println("Enter the value of y2");
        y2=input.nextDouble();

        System.out.println("Enter the value of x3");
        x3=input.nextDouble();

        System.out.println("Enter the value of y3");
        y3=input.nextDouble();


        /**
         * Object creation.
         */
        Triangles t=new Triangles(x1,y1,x2,y2,x3,y3);

        /**
         * Print all the value.
         * Those are : side lengths,area,perameter and angles
         */
        System.out.print("The first side length a= ");
        System.out.println(+t.getLength1());

        System.out.println("The second side length b=");
        System.out.println(+t.getLength2());

        System.out.println("The third side length c= ");
        System.out.println(+t.getLength3());

        System.out.print("The angle <A = ");
        System.out.println(+t.getAngle_a());

        System.out.print("The angle <B = ");
        System.out.println(+t.getAngle_b());

        System.out.print("The angle <C = ");
        System.out.println(+t.getAngle_c());

        System.out.print("The Area is A= ");
        System.out.println(+t.getArea());

        System.out.print("The perameter is P=");
        System.out.print(+t.getPerameter());

    }
}

