import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        //Testing any angle from user input
        double angle;
        System.out.print("Enter any angle to bind to [-180,180) degrees: ");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextDouble();
        System.out.println("Equivalent angle: " + AngleCalc.boundTo180(angle));

        //Testing isAngleBetween method from user input
        double boundOne;
        double boundTwo;
        double testAngle;
        System.out.println("\nPlease enter one of the bounds: ");
        boundOne = sc.nextDouble();
        System.out.println("Please enter the other bound: ");
        boundTwo = sc.nextDouble();
        System.out.println("Please enter the test angle: ");
        testAngle = sc.nextDouble();
        System.out.println("The test angle is within the bounds: " + AngleCalc.isAngleBetween(boundOne, testAngle, boundTwo));
    }
}
