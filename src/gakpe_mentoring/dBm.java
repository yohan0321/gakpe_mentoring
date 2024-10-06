package gakpe_mentoring;
import java.util.Scanner;

public class dBm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전압을 입력하세요: ");
		float V = sc.nextFloat();
		System.out.println("저항을 입력하세요: ");
		float R = sc.nextFloat();
		
		float P = (V * V) / R;
		double dBm = 10 * Math.log10(P) + 30;
		System.out.println("dBm: " + dBm);
	}
}
