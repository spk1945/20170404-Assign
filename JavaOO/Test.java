package test;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�հ� ����� ���� �Ǽ����� �Է��Ͻÿ�.");
		
		String input = scan.nextLine();
		String arry[] = input.split(" ");
		
		double num[] = new double[arry.length];
		
		for(int i = 0; i<=arry.length; i++) {
			num[i] = Double.parseDouble(arry[i]);
		}
	}
}
