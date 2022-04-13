package logic;
import java.util.Locale;
import java.util.Scanner;

public class uri1011 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14159;
		double R = sc.nextDouble();
		double volume = (4.0 / 3) * pi * (R * R * R);
		
		System.out.println("VOLUME = " + String.format("%.3f", volume));
		
		sc.close();
	}
}
