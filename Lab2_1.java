import java.util.Scanner;
public class Lab2_1
{
    public static void main(String[] args)
    {
        //import scanner for user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates for two points");
        //assign user input as variables
        System.out.print("Enter the x-coordinate of point 1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter the y-coordinate of point 1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter the z-coordinate of point 1: ");
        double z1 = in.nextDouble();
        System.out.print("Enter the x-coordinate of point 2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter the y-coordinate of point 2: ");
        double y2 = in.nextDouble();
        System.out.print("Enter the z-coordinate of point 2: ");
        double z2 = in.nextDouble();
        //calculate distance between point 1 and 2
        double xd = x1 - x2;
        double yd = y1 - y2;
        double zd = z1 - z2;
        double d = Math.sqrt((xd * xd) + (yd * yd) + (zd * zd));
        System.out.print("The distance between point 1 and point 2 is: " + d);
        in.close();

    }
}
