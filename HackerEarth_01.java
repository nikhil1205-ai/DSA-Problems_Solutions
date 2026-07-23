// Euler's Totient Function

// Euler Totient Function (ETF) Φ(n) for an input n is the count of numbers whose GCD (Greatest Common Divisor) with n is 1.


import java.util.*;

class TestClass {


    static int GCD(int k,int i){
        while(i!=0){
            int temp=k%i;
            k=i;
            i=temp;
        }
        return k;
    }
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int iter = s.nextInt(); 
        for(int j=0;j<iter;j++){
            int k=s.nextInt();
            int ans=1;    
            for(int i=2;i<=k;i++){
                if(GCD(k,i)==1) ans++;

            }

            System.out.println(ans);


        }
        

    }
}
