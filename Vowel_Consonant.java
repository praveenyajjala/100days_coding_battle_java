// program to identify if the character is a vowel or consonant
import java.util.*;
public class Vowel_Consonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// compiler is going to take the user input
		char ch =sc.next().charAt(0);
		// this condition will check whether the input is character are not
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
}
