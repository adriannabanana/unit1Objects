import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int cast = generator.nextInt(6)+1;
        System.out.println(cast);
        
        double cast2 = Math.random(); // returns [0,1)
        cast2 *= 6;
        cast2 +=1;
        System.out.println((int)cast2);
    }
}