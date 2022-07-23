package test;

import java.util.Arrays;
import java.util.Scanner;

public class maiyifu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //0是利润，1是数量
            int[][] arr= new int[3][2];
            arr[0][0] = sc.nextInt();
            arr[1][0] = sc.nextInt();
            arr[2][0] = sc.nextInt();
            int d = sc.nextInt();
            arr[0][1] = sc.nextInt();
            arr[1][1] = sc.nextInt();
            arr[2][1] = sc.nextInt();

            Arrays.sort(arr);
            if(d<=arr[2][0]){
                System.out.println(arr[2][0] * d);
            }
            else if(d<=arr[2][0]+arr[1][0]){
                System.out.println(arr[2][0]*arr[2][1] + arr[1][0]*(d-arr[2][1]));
            }
            else if(d<=arr[2][0]+arr[1][0]+arr[0][0]){
                System.out.println(arr[2][0]*arr[2][1]+arr[1][0]*arr[1][1]+arr[0][0]*(d-arr[2][1]-arr[1][1]));
            }
            else{
                System.out.println(arr[2][0]*arr[2][1]+arr[1][0]*arr[1][1]+arr[0][0]+arr[0][1]);
            }
        }
    }
}
