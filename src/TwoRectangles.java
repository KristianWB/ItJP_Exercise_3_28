import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter coordinates (x,y), length and width for first rectangle: \n" +
                        "x1: "
                );
        double x1 = input.nextDouble();
        System.out.print(
                "y1: "
        );
        double y1 = input.nextDouble();
        System.out.print(
                "Width: "
        );
        double length1 = input.nextDouble();
        System.out.print(
                "Height: "
        );
        double height1 = input.nextDouble();
        System.out.print("\n");

        double firstRectangleLeftLimit = x1 - length1 * 0.5;
        double firstRectangleRightLimit = x1 + length1 * 0.5;
        double firstRectangleTopLimit = y1 + height1 * 0.5;
        double firstRectAngleBottomLimit = y1 - height1 * 0.5;

        System.out.print(
                "Enter coordinates (x,y), length and width for the second rectangle: \n" +
                        "x2: "
        );
        double x2 = input.nextDouble();
        System.out.print(
                "y2: "
        );
        double y2 = input.nextDouble();
        System.out.print(
                "Width: "
        );
        double length2 = input.nextDouble();
        System.out.print(
                "Height: "
        );
        double height2 = input.nextDouble();
        System.out.print("\n");

        double secondRectangleLeftLimit = x2 - length2 * 0.5;
        double secondRectangleRightLimit = x2 + length2 * 0.5;
        double secondRectangleTopLimit = y2 + height2 * 0.5;
        double secondRectAngleBottomLimit = y2 - height2 * 0.5;

        if (firstRectangleLeftLimit < secondRectangleRightLimit && firstRectangleRightLimit > secondRectangleLeftLimit && firstRectAngleBottomLimit < secondRectangleTopLimit && firstRectangleTopLimit > secondRectAngleBottomLimit)   {
            if(firstRectangleLeftLimit <= secondRectangleLeftLimit && firstRectangleRightLimit >= secondRectangleRightLimit && firstRectAngleBottomLimit <= secondRectAngleBottomLimit && firstRectangleTopLimit >= secondRectangleTopLimit)
                System.out.print(
                        "The second rectangle is within the bounds of the first rectangle"
                );
            else
                System.out.print(
                        "The second square is overlapping the first"
                );
        }
        else
            System.out.print(
                    "The second rectangle is outside the boundries of the first"
            );





    }
}
