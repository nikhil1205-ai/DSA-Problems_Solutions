import java.util.*;

public class BKefaAndCompany {
    static class Friend{
        long money,factor;
        Friend(long money,long factor){
            this.money=money;
            this.factor=factor;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int friends=sc.nextInt();
        long diff=sc.nextLong();
        
        Friend[] arr=new Friend[friends];
        
        for(int i=0;i<friends;i++){
            arr[i] = new Friend(sc.nextLong(),sc.nextLong());
        }
        
        Arrays.sort(arr,Comparator.comparingLong(a-> a.money));
        
        int left=0;
        Long sum=Long.valueOf(0),ans=Long.valueOf(0);
        
        
        for(int right=0;right<friends;right++){
            sum+=arr[right].factor;
            
            while(arr[right].money-arr[left].money>=diff){
                sum-=arr[left].factor;
                left++;
            }
            ans=Math.max(ans,sum);
        }
        
        System.out.println(ans);
        
        
    }
}