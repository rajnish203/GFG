import java.util.HashMap;
import java.util.PriorityQueue;

class topKElements {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        PriorityQueue<Integer>kQueue=new PriorityQueue<>(k, (a, b)->{
            int freq=map.get(b).compareTo(map.get(a));
            if(freq==0){
                return b.compareTo(a);
            }
            return freq;
        });
        
        for(int i:map.keySet()){
            kQueue.offer(i);
        }
        
        int result[]=new int[k];
        int j=0;
        while(!kQueue.isEmpty() && j<k){
            result[j++]=kQueue.poll();
        }
        
        return result;
    }
}
