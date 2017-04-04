package test;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
   	double sum=0;
    int count=0;
		
    System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
    Scanner input = new Scanner(System.in);  
 	       
    int size = input.nextInt();
    double num[] = new double[size];
    
    System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
    System.out.print("실수 " + size + "개를 입력하세요. >> ");    
    
    for(int i=0; i<size; i++) {
    	num[i] = input.nextDouble();
    	if(num[i]==0) break;
    	sum += num[i];
        count += 1;
    }
    
        
        System.out.println("합: " + sum + ", 평균: " + sum/count);
	}
}
