public class String1
{
    public static void main(String[] args)
    {
        String greeting = "Hello, world!";
        int n = greeting.length();
        System.out.println(n);     
        
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println("river: " + river + " bigRiver: " + bigRiver);
        
        String test = "This is a Test";
        String smallTextString = test.toLowerCase();
        System.out.println(smallTextString);
        
        String bigTextString = smallTextString.toUpperCase();
        System.out.println(bigTextString);
    }
}