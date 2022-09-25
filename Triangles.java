/**
 * Sub class
 * In this class calculate the value of 3 side lengths, 3 angles ,Parameter ans Area
 */

public class Triangles
{


    /**
     * Initialization of varriables;
     */
    private double a, b, c, s, s1, area, perameter;
    private double x1, y1, x2, y2, x3, y3;
    private double length1, length2, length3, angle_a, angle_b, angle_c;

    /**
     * Create constructor
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
    public Triangles(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    /**
     * set getline1 method to determine the first sidelength
     * @return
     */
    public double getLength1()
    {
        length1= Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        a=length1;
        return a;

    }

    /**
     * set getline2 method to determine the Second sidelength
     * @return
     */

    public double getLength2()
    {
        length2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        b = length2;
        return b;
    }

    /**
     * set getline3 method to determine the Third sidelength
     * @return
     */
    public double getLength3()
    {
        length3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        c = length3;
        return c;
    }


    /**
     * set getAngle_a method to determine the First Angle;
     * @return
     */
    public double getAngle_a()
    {

        angle_a = Math.toDegrees(Math.acos(((b * b) + (c * c) - (a * a)) / 2 * b * c));
        return angle_a;
    }


    /**
     * set getAngle_b method to determine the Second Angle;
     * @return
     */
    public double getAngle_b()
    {
        angle_b = Math.toDegrees(Math.acos(((a * a) + (c * c) - (b * b)) / 2 * a * c));
        return angle_b;
    }

    /**
     * set getAngle method_c to determine the Three Angle;
     * @return
     */
    public double getAngle_c()
    {
        angle_c = Math.toDegrees(Math.acos(((a * a) + (b * b) - (c * c)) / 2 * b * b));
        return angle_c;
    }

    /**
     * set getParameter method to determine the Prameter;
     * @return
     */
    public double getPerameter()
    {
        return a+b+c;
    }

    /**
     * set getAria method to determine the Area;
     * @return
     */
    public double getArea()
    {
        double s1 = getPerameter()/2;
        area = Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c));
        return area;

    }
}

