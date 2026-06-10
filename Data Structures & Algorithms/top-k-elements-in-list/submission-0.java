class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int num: nums) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }
        freqCount.forEach((key, val) -> {
             minHeap.add(new int[]{key,val});
             if(minHeap.size() > k) minHeap.remove();
        });
        return minHeap.stream().mapToInt(arr -> arr[0]).toArray();

    }
}
