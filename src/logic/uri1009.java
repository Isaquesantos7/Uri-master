package logic;
import java.util.Scanner;
import java.util.Locale;

public class uri1009 {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nameVendedor = sc.next();
		double salario = sc.nextDouble();
		double vendasTotal = sc.nextDouble();

		double salarioTotal = ((vendasTotal * 15) / 100 )  + salario;
		
		System.out.println(String.format("TOTAL = R$ %.2f", salarioTotal));
		
		sc.close();
	}
}
