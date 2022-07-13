import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        
        //Enter movie rating (as a decimal) 1.4
        //Rating rounded: 1
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal) ");
        double movieRating = input.nextDouble();
        
        movieRating = (movieRating + 0.5);
        int movRating = (int)(movieRating);
        System.out.println(movRating);
       
    }
}
