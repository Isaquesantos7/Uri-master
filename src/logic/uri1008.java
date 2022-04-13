package logic;

import java.util.Scanner;

public class uri1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		var number = sc.nextInt();
		var horasTra = sc.nextInt();
		var valorHora = sc.nextDouble();
		
		var salario = horasTra * valorHora;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", salario));
		
		sc.close();
	}
}
