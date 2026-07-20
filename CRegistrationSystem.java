import java.util.*;

public class CRegistrationSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        HashMap<String,Integer> hs=new HashMap<>();
        
        for(int i=0;i<num;i++){
           String str=sc.next();
           if(!hs.containsKey(str)){
               hs.put(str,1);
               System.out.println("OK");
           }else{
               System.out.println(str+hs.get(str));
               hs.put(str,hs.get(str)+1);
           }
           
        }
        
        
    
    }
}