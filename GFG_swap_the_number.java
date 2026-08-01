// Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a.
//  Just write the code to swap values of a and b at the specified place.

class Solution {
    public void swap(int a, int b) {   
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a + " " + b);
    }
}
