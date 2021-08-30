public final class AngleCalc 
{
    public AngleCalc()
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Bounds the provided angle between [-180, 180) degrees.
     * Ex. 360 becomes 0, 270 becomes -90, -450 becomes -90.
     * @param angle Input angle in degrees.
     * @return The bounded angle in degrees.
     */
    public static double boundTo180(double angle)
    {
        //While loop only runs if angle is outside of [-180, 180)
        while(angle < -180 || angle >= 180)
        {
            if(angle < -180)
            {
                angle += 360;
            }
            else if(angle >= 180)
            {
                angle -= 360;
            }
        }
        return angle;
    }
    
    /**
     * Determines whether |middle_angle| is in the acute angle between the other two bounding angles.
     * Note: Input angles are bounded to 180 for safety.
     * Ex. -180 is between -90 and 110 but not between -90 and 80.
     * @param first_angle First angle in degrees.
     * @param middle_angle Middle angle in degrees.
     * @param second_angle Second angle in degrees.
     * @return Whether |middle_angle| is between |first_angle| and |second_angle| (exclusive).
     */
    public static boolean isAngleBetween(double first_angle, double middle_angle, double second_angle)
    {
        double largerAngle;
        double smallerAngle;
        double testAngle = boundTo180(middle_angle);
        if(boundTo180(first_angle) > boundTo180(second_angle))
        {
            largerAngle = boundTo180(first_angle);
            smallerAngle = boundTo180(second_angle);
        }
        else
        {
            largerAngle = boundTo180(second_angle);
            smallerAngle = boundTo180(first_angle);
        }
        if(largerAngle - smallerAngle == 180 && testAngle != largerAngle && testAngle != smallerAngle)
        {
            //Because there is no acute angle in this case, either half of the circle can be acute
            //All that matters is the test angle is not equal to the bounds
            return true;
        }
        else if(largerAngle - smallerAngle > 180 && (testAngle > largerAngle || testAngle < smallerAngle))
        {
            //This considers the case where acute angle is above upper bound angle
            return true;
        }
        else if(largerAngle - smallerAngle < 180 && (testAngle < largerAngle && testAngle > smallerAngle))
        {
            //This considers the case where acute angle is below upper bound angle
            return true;
        }
        else
        {
            return false;
        }
    }
}
