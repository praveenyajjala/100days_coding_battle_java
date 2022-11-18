// program to check whether given input is alphabet or not
import java.util.*;
public class Alphabet_notAlphabet {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not an Alphabet");
		}
	}
}
