import java.util.Scanner;

public class userInput{
    public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("please enter your full name: ");
		String fullname = scan.nextLine();
		System.out.printf("Hello %s,How are you today?", fullname);
	}
}
