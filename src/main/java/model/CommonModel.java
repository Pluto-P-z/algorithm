package model;
import java.util.*;

public class CommonModel{
    public static int[] tmp;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int len=sc.nextInt();
                int[] nums=new int[len];
                for(int i=0;i<len;i++){
                    nums[i]=sc.nextInt();
                }
                //以下是答题区域
                for (int i=0;i<len;i++){
                    System.out.println(nums[i]);
                }

            }
    }
}