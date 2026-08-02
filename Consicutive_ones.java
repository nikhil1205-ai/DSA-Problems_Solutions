import java.util.*;

public class Main {
    public static void main(String[] args){

     int n=199;
     System.out.println(Integer.toBinaryString(n));
     int c=0,m=0;

     while(n>0){
        if((n&1)==0){ c=0; n=n>>1;}
        else{
          c++;
          m=Math.max(c,m);
          n=n>>1;
        }
     }

     System.out.println(m);
    }
}