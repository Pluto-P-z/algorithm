package test;

import java.util.PriorityQueue;
import java.util.Queue;

public class meisbook {
    public static void main(String[] args) {
        System.out.println('a'-'a');
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(2);
        int i=0;
        for (Integer integer : queue) {
            if(integer!=i+1){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
