package test;


import java.util.*;


public class testing {

    static int[] tmp = new int[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int len = sc.nextInt();
            int[] nums = new int[len];
            for(int i=0;i<len;i++){
                nums[i] = sc.nextInt();
            }
            mergeSort(nums,0,len-1);
            for (int num : nums) {
                System.out.println(num);
            }
        }
    }
    static void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        mergeSort(nums,l,mid-1);
        mergeSort(nums,mid+1,r);
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid&&j<=r){
            if(nums[i]>nums[j]){
                tmp[k++]=nums[j++];
            }
            else{
                tmp[k++]=nums[i++];
            }
        }
        while(i<=mid){
            tmp[k++]=nums[i++];
        }
        while(j<=r){
            tmp[k++]=nums[j++];
        }
        for(int m=l;m<=r;m++){
            nums[m]=tmp[m];
        }
    }

}
