import java.util.*;

class ATwins{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        
        Arrays.sort(arr);
        int ans=0;
        int val=0;
        for(int i=n-1;i>=0;i--){
            if(val<=sum/2) {
                val+=arr[i];
                ans++;
            }
        }
        
        System.out.println(ans);
        
        
    }
}

