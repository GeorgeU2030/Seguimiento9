package exercises;

import java.util.Scanner;

public class Monks_Encounter_with_Polynomial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,a,b,c,k;
	    t=sc.nextInt();
		int[]r=new int[t];
		for(int i=0;i<t;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			k=sc.nextInt();
			int pol=0;
			int j=0;
			while(pol<k){
				pol=a*(j*j)+b*j+c;
				if(pol>=k){
	             r[i]=j;
				 break;
				}
				j++;
			}
		}
		for(int i=0;i<t;i++){
	        System.out.println(r[i]);
		}
	}

}
