package logic;

import java.util.Locale;
import java.util.Scanner;

public class uri1013 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A > B && A > C) {
			System.out.println(A + " eh o maior");
		}else if(B > A && B > C) {
			System.out.println(B + " eh o maior");
		}
		else {
			System.out.println(C + " eh o maior");
		}
		sc.close();
	}
}
