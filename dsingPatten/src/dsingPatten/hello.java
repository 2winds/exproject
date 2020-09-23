package dsingPatten;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		float A = sc.nextInt();
		float B = sc.nextInt();
		float C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println((B%C)%C);
		}
	}


