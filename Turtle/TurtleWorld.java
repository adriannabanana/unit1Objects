import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.YELLOW);
        turtle.penDown();

        Turtle friend = new Turtle(turtleWorld);
        friend.setPenColor(Color.GREEN);

        friend.backward(350);
        
        friend.turnRight();
        friend.penDown();
        friend.forward(500);
        friend.backward(500);
        
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
        turtle.forward(5);
        turtle.turn(5);
     
    }
}
