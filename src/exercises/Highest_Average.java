package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Highest_Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []numbers=new int[n];
        int []sum=new int[n];
        for(int i=0;i<n;i++) {
        	numbers[i]=sc.nextInt();
        }
        Arrays.parallelSort(numbers, 0, n);
        sum[0]=numbers[0];
        for(int i=1;i<n;i++){
            sum[i]=0;
        }
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+numbers[i];
        }
        float []prom=new float[n];
        prom[0]=sum[0];
        for(int i=1;i<n;i++){
            float a=sum[i];
            prom[i]=a/(i+1);
        }
        
        int q=sc.nextInt();
        while(q-->0){
            int k=sc.nextInt();
            int beg=0;
        while(prom[beg]<k&&beg<n){
            beg++;
            if(beg==n) {
            	break;
            }
        }
        System.out.println(beg);
        }
        }

}
