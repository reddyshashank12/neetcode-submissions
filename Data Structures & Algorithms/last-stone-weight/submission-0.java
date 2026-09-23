class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1){

            int p = pq.poll();
            int q = pq.poll();

            if(p != q){
                pq.add(p-q);
            }
        }

        return (pq.isEmpty())? 0: pq.peek();
    }
}