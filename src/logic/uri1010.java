package logic;
import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id1 = sc.nextInt(); int quantidade1 = sc.nextInt(); double price1 = sc.nextDouble();
		int id2 = sc.nextInt(); int quantidade2 = sc.nextInt(); double price2 = sc.nextDouble();
		
		double valorTotal = (quantidade1 * price1) + (quantidade2 * price2);
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));
		
		
		sc.close();
	}
}
