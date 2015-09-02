import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle friend = new Turtle(turtleWorld);
        friend.penUp();
        turtle.penUp();
        
        while (turtle.getYPos() != 100)  {
            Thread.sleep(100);
            turtle.forward(5);
        }
        
        turtle.turnLeft();
        while (turtle.getXPos() != 100) {
            Thread.sleep(100);
            turtle.forward(5);
        }
        
        turtle.setPenColor(Color.YELLOW);
        turtle.setPenWidth(75);
        turtle.penDown();
        turtle.forward(1);

        friend.setPenColor(Color.GREEN);
        friend.setPenWidth(20);

        friend.backward(300);
        friend.turnRight();
        friend.penDown();
        friend.forward(300);
        friend.backward(700);
        

     
    }
}
