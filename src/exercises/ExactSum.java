package exercises;

import java.util.Scanner;

public class ExactSum {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=0;
         while(sc.hasNextLine()) {
        	  n=sc.nextInt();
        	 int[] priceb=new int[n];
         for(int i=0;i<n;i++) {
        	 int books=sc.nextInt();
        	 priceb[i]=books;
         }
         int m=sc.nextInt();
         int beg = 0, end = priceb.length - 1;
         int booksA=0;
         int booksB=0;
         int temp=0;
         for(int i=0;i<priceb.length;i++){
			    for(int j=i+1;j<priceb.length;j++){
			        if(priceb[i]>priceb[j]){
			            temp=priceb[j];
			            priceb[j]=priceb[i];
			            priceb[i]=temp;
			        }
			    }
			   }
         while (beg < end)
         {
             if (priceb[beg] + priceb[end] < m)
                 beg++;
             else if (priceb[beg] + priceb[end] == m)
             {
                 booksA=beg;
                 booksB=end;
                 beg++;
                 end--;
             }
             else
                 end--;
         }
         System.out.println("Peter should buy books whose prices are "+priceb[booksA]+" and "+priceb[booksB]+".\n");
	}
	}

}
