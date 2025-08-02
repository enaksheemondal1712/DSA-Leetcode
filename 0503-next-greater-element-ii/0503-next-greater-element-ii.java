class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int n=nums.length;
    int[] result =new int[n];
    Stack<Integer>  stack =new Stack<>();

    Arrays.fill(result,-1);

    for (int i = 0; i < 2 * n; i++) {

        int idx=i%n;

        while(!stack.isEmpty()&&nums[idx]>nums[stack.peek()]){
            int prevIndex= stack.pop();
            result[prevIndex] =nums[idx];
        }
        if(i<n){
            stack.push(idx);
        }
    }
    return result;
    }
}

