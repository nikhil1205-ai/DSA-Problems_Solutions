import java.util.*;

public class BKefaAndCompany {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int friend= sc.nextInt();
        int budget = sc.nextInt();
        
        int sum=0;
        for(int i=0;i<friend;i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            if(a-budget>) sum+= b;
            
        }
        System.out.println(sum);
        
        
        
        
    }
}