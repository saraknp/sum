//Given an Srray, how do you get the count of pairs that sum to even
public class SumToEven {

	public static void main(String[] args) {
		
        int[] ar= {3,6,8,2,9,1,4,34,21,7};
        int sum=0;
        int cnt=0;
        
        for(int i=0; i<ar.length; i++) {
        	   for(int j=i+1; j<ar.length; j++) {
        		   sum=ar[i]+ar[j];
        		   if(sum%2==0) {
        			   cnt++;
        			   System.out.println("Pair"+ cnt+ " = " + ar[i] +" + "+ ar[j]);
        		   }
        	   }
        }
        
        System.out.println(cnt+" Pairs That Sum To Even");
	}

}
