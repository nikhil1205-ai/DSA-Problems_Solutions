import java.util.*;

public class BTaxi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        int count=0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        
        int ans = (count + 3) / 4;
        System.out.println(ans);
    }
}