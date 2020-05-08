import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
        
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=1;
        if(n>0 && n<=50)
        {
        while(i<=n)
        {
            
            int spaces=1;
            while(spaces<=n-i)
            {
                System.out.print(" ");
                spaces++;
            }
            int p=i;
            int j=1;
            while(j<=i)
            {
                System.out.print(p);
                p++;
                j++;
            }
            p--;
            int remain=1;
            
            while(remain<=i-1)
            {
                p=p-1;
                System.out.print(p);
                remain++;
            }
            
            
            
            
            i++;
            System.out.println();
        }
        }
	}
}
