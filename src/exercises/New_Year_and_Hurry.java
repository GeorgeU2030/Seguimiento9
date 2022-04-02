package exercises;

import java.util.Scanner;

public class New_Year_and_Hurry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int n=sc.nextInt();
        int k=sc.nextInt();
        int timemax=240-k;
        int time=0;
        int problems=1;
        while(problems<=n) {
        	time+=5*problems;
        	if(time>timemax) {
        		break;
        	}
        	problems++;
        	
        }
        System.out.println(problems-1);
	}

}
