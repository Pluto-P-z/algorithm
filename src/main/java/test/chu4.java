package test;

import java.util.Scanner;

public class chu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            while (n>4){
                n/=4;
            }
            if(n%4==0&&n!=0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }
}
