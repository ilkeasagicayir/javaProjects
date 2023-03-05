package deneme;

import java.util.Scanner;

public class ders43 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num = scan.nextInt();
        int temp = num;
        pattern(num, temp);

    }

    static void pattern(int num, int temp) {
      
        if(num>0){
            System.out.print(num+" ");

            pattern(num-5,temp);
        }
        if (num<=0){
            pattern2(num,temp);
        }


    }
    static void pattern2(int num,int temp){
        if(num<=temp){
            System.out.print(num+" ");
            pattern2(num+5,temp);
        }

    }
}
