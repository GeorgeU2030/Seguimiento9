package exercises;

import java.util.Scanner;

public class Progammers_and_Mathematicians {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		int i=0;
		int ta=t;
		int[]r=new int[t];
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			 int minmin=0;
			 if(a<b) {
				 minmin=a;
			 }else {
				 minmin=b;
			 }
			 int group=(a+b)/4;
			 int min=0;
			 if(minmin<group) {
				 min=minmin;
			 }else {
				 min=group;
			 }
			 r[i]=min;
			 i++;
		}
		for(int a=0;a<ta;a++) {
			System.out.println(r[a]);
		}
		

	}

}
