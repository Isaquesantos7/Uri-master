package logic;

import java.util.Scanner;
import java.text.DecimalFormat;

public class uri1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		final double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio,2);
		
		System.out.println("A=" + df.format(area));
		
		sc.close();
	}
}
