import java.awt.Rectangle;

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);

        double width = box.getWidth();
        double height = box.getHeight();
        width = width + 5;
        height = height + 10;
        
        int x = 0;
        int y = 0;       
        box.add(x, y);
        
        System.out.println("Expected location, width, and height");
        System.out.println(x+", "+y+", "+width+", "+height);
        System.out.println("Actual location, width, and height");
        System.out.println(box);
    }
}