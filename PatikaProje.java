import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. Kenarı giriniz: ");
		int a = input.nextInt();
		System.out.print("2. Kenarı giriniz: ");
		int b = input.nextInt();
		System.out.print("3. Kenarı giriniz: ");
		int c = input.nextInt(), ucgencevresi = a + b + c;
		double u = ucgencevresi / 2.0, alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Alan -> " + alan);
	}

}
