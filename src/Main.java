import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
	
	
	System.out.println("Enter your passage");
	String content = scan.nextLine();	
	scan.close();
	Content myContent =  new Content(content);
	String word = "the";
	System.out.println(word + ": " + myContent.getCount(word));
	
	
		}

}
