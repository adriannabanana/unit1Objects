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
            Thread.sleep(5);
            turtle.forward(5);
        }
        
        turtle.turnLeft();
        while (turtle.getXPos() != 100) {
            Thread.sleep(5);
            turtle.forward(5);
        }
        
        turtle.setPenColor(Color.YELLOW);
        turtle.setPenWidth(10);
        turtle.penDown();
        
        int i = 0;
        while (i<120) {
            Thread.sleep(5);
            turtle.forward(3);
            turtle.turn(3);
            i+=1;
        }
        
        turtle.penUp();
        turtle.forward(18);
        turtle.turnRight();
        turtle.forward(45);
        turtle.setPenColor(Color.BLACK);
        turtle.penDown();
        turtle.forward(1);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(38);
        turtle.penDown();
        turtle.forward(1);
        
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(15);
        i = 0;
        turtle.setPenWidth(7);
        turtle.penDown();
        while (i<60) {
            Thread.sleep(5);
            turtle.forward(2);
            turtle.turn(3);
            i+=1;
        }
        
        i = 0;
        friend.setPenColor(Color.GREEN);
        friend.setPenWidth(20);
        while (i<60) {
            friend.backward(30);
            friend.turnRight();
            friend.penDown();
            friend.forward(30);
            friend.backward(70);
            i+=3;
    }
    turtle.penUp();
    turtle.turn(180);
    turtle.forward(400);
    turtle.turnLeft();
    turtle.forward(200);
    turtle.setPenColor(Color.ORANGE);
    turtle.penDown();
    turtle.turnLeft();
    turtle.forward(175);
    
    }
}
