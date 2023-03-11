package model;
import java.util.*;

class Main{
    static HashSet<String> set = new HashSet<>();
    static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            dfs(i, "",str.length());
        }
        System.out.println(set.size());
    }
    public static void dfs(int start,String s,int res){
        if(res==0){
            return;
        }
        set.add(str.charAt(start%str.length())+"");
        s+=str.charAt(start%str.length());
        set.add(s);
        dfs(start+1,s,res-1);
    }
}