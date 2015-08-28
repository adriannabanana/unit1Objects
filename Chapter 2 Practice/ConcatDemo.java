public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox ";
        String animal2 = "lazy dog ";
        String article = "the ";
        String action = "jumps over ";
        String message = article;
        message = message.concat(animal1);
        message = message.concat(action);
        message = message.concat(article);
        message = message.concat(animal2);
        System.out.println(message);
        
        String new_message = article+animal1+action+article+animal2;
        System.out.println(new_message);
        
        
    }
}
        