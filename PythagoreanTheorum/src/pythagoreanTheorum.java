/*quadratic formula solver
 * Ethan Hill
 * 9-21-24
 */

 import java.util.Scanner;

 public class pythagoreanTheorum {
    public static void main(String[] args) {
        
        //setup scanner 
        Scanner input = new Scanner(System.in );

        //variables

        double a, b, c, a2, b2, c2;

        //get users data

        System.out.println("Please enter leg a of your tringle");
        a = input.nextDouble();

        System.out.println("Please enter leg b of your tringle");
        b = input.nextDouble();

        //do math
        a2 = a * a;
        b2 = b * b;

        c2 = a2 + b2;

        c = Math.sqrt(c2);

        //output

        System.out.println("The hypotenuse of your triangle is " + c);

    }
    
 }