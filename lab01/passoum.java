import java.util.Scanner;
public class passoum {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
            float number_one = sc.nextFloat();
            float number_two = sc.nextFloat();
            float media = (number_one + number_two) / 2;

            if (media >= 7.0) {
            	System.out.println("pass: True!");
            } else {
            	System.out.println("pass: False!");
            }
        }
		
		
	}
}