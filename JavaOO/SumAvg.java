package test;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
   	double sum=0;
    int count=0;
		
    System.out.print("�Է��� �ִ� �Ǽ��� ������ �Է��ϼ���. >> ");    
    Scanner input = new Scanner(System.in);  
 	       
    int size = input.nextInt();
    double num[] = new double[size];
    
    System.out.println("\n�߰��� 0�� �Է��ϸ� ���� �Է��ڷ�� ����ϰ� �����մϴ�.");  
    System.out.print("�Ǽ� " + size + "���� �Է��ϼ���. >> ");    
    
    for(int i=0; i<size; i++) {
    	num[i] = input.nextDouble();
    	if(num[i]==0) break;
    	sum += num[i];
        count += 1;
    }
    
        
        System.out.println("��: " + sum + ", ���: " + sum/count);
	}
}
