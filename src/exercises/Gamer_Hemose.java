package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Gamer_Hemose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int h=sc.nextInt();
			int[] damage=new int[n];
			for(int j=0;j<n;j++) {
				damage[j]=sc.nextInt();
			}
			int temp=0;
			Arrays.parallelSort(damage, 0, n);
			int kill=0;
			int mdamage=damage[n-1];
			int m2damage=damage[n-2];
			int weapons=0;
			while(kill<=h) {
				kill+=mdamage;
				weapons++;
				if(kill>=h) {
					break;
				}
				kill+=m2damage;
				weapons++;
				if(kill>=h) {
					break;
				}
			}
			System.out.println(weapons);
			
		}

	}

}
