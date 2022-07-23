package test;

import java.util.Scanner;

public class EF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String EF = sc.next();
            int front = 0;
            int rear = 0;
            int count = 0;
            int max = 0;
            for(;front<n;front++){
                if(EF.charAt(front)==('E')){
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                else {
                    count--;
                    if(count<=0){
                        rear++;
                        front = rear;
                        count = 0;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
