package com.internshala;

public class practice_07 {
    public static void calculation (int principal , float RoI , int timePeriod){
        double si = principal * RoI * timePeriod / 100;
        System.out.println(si);
    }
    public static void main(String[] args) {
          // User 1
//        int principal1 = 3000;
//        float RoI1 = 4.2f;
//        int timePeriod1 = 2;
        calculation(3000,4.2f,2 );  // We can simply pass the argument value in one line so that we can avoid unnecessary code lines

        // User 2
//        int principal2 = 9000;
//        float RoI2 = 5.2f;
//        int timePeriod2 = 3;
        calculation(9000,5.2f,3 );
    }
}
