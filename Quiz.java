package aminoacidquiz;
import java.util.Random;
import java.util.Scanner;

public class Quiz 
{
	public static String[] SHORT_NAMES = 
		{ "A","R", "N", "D", "C", "Q", "E", 
		"G",  "H", "I", "L", "K", "M", "F", 
		"P", "S", "T", "W", "Y", "V" 
		};

	public static String[] FULL_NAMES = 
		{"alanine","arginine", "asparagine", 
		"aspartic acid", "cysteine",
		"glutamine",  "glutamic acid",
		"glycine" ,"histidine","isoleucine",
		"leucine",  "lysine", "methionine", 
		"phenylalanine", "proline", 
		"serine","threonine","tryptophan", 
		"tyrosine", "valine"};
	
	public static void main(String[] args)
	{  
		System.out.println("Quiz: Provide one letter code for aminoacid");
		long startTime = System.currentTimeMillis();
		int x=0;
		while ((System.currentTimeMillis() - startTime)/ 1000f < 30 ) 
		{
			Random random = new Random(); 
			int draw = random.nextInt(20);
			System.out.println(FULL_NAMES[draw]); 
			Scanner input = new Scanner(System.in); 
			String entered = input.nextLine();
			String enteredup = entered.toUpperCase();
				if (enteredup.compareTo(SHORT_NAMES[draw])==0) 
				{
				System.out.println("*** Correct! ***" );  
				x = x + 1;
				System.out.println("score =" + x + " ; seconds = " + (System.currentTimeMillis() - startTime)/ 1000f + " out of 30");
				}
				else
				{
				System.out.println("--- Incorrect! --- should be " + SHORT_NAMES[draw]); 
				System.out.println("Quiz ends with a score of " + x);
				break;
				}
		}
		System.out.println("Time's up!!!" );
	}
}
