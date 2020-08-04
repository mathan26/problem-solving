package com.github.mathan26.leetcode.challenges.april;

import java.util.PriorityQueue;

public class LastStoneWeight {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
            for(int i:stones)
                pq.offer(i);

            while(pq.size() > 1){
                pq.offer(pq.poll()-pq.poll()); // stone smash
            }
            return pq.poll(); //return the last stone
        }
}
