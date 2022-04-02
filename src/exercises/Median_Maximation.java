package exercises;

import java.util.Scanner;

public class Median_Maximation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t-->0) {
    	int n=sc.nextInt();
    	int s=sc.nextInt();
    	int mid=n/2+1;
    	int median=s/mid;
    	System.out.println(median);
        }
	}

}
