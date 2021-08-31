import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        //Unit tests for boundTo180()
        System.out.println("360 degrees bounded is: " + AngleCalc.boundTo180(360));
        System.out.println("270 degrees bounded is: " + AngleCalc.boundTo180(270));
        System.out.println("-450 degrees bounded is: " + AngleCalc.boundTo180(-450));
        System.out.println("100 degrees bounded is: " + AngleCalc.boundTo180(100) + "\n");

        //Unit tests for isAngleBetween()
        System.out.println("-180 is between (-90,110): " + AngleCalc.isAngleBetween(-90,-180,110));
        System.out.println("-180 is between (-90,80): " + AngleCalc.isAngleBetween(-90,-180,80));
        System.out.println("90 is between (-45,45): " + AngleCalc.isAngleBetween(-45,90,45));
        System.out.println("90 is between (45,135): " + AngleCalc.isAngleBetween(45,90,135));
        System.out.println("0 is between (90,-90): " + AngleCalc.isAngleBetween(90,0,-90));
    }
}
