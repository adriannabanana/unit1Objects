import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.forward(100);
        turtle.setPenColor(Color.YELLOW);
        
        turtle.setPenWidth(10);


        
        Turtle friend = new Turtle(turtleWorld);
        friend.setPenColor(Color.GREEN);
        friend.setPenWidth(20);

        friend.backward(350);
        
        friend.turnRight();
        friend.penDown();
        friend.forward(500);
        friend.backward(500);
        

     
    }
}
