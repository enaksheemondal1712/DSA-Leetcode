class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        int majorityElement =nums.length/2;
        for(int num : nums){
            counts.put( num, counts.getOrDefault(num,0)+1);
            if(counts.get(num)>majorityElement){
                return num;
            }
        }
        return -1;
    }
}
