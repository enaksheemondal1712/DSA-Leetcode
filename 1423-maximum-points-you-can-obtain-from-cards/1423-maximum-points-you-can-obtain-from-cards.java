class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n =cardPoints.length;
        int windowsize=n-k;

        int maxsum=0;
        for(int x:cardPoints){
            maxsum+=x;
        }

        int currsum=0;
        for(int i=0;i<windowsize;i++){
            currsum+= cardPoints[i];
        }

        int minsum=currsum;

        for(int i= windowsize;i<n;i++){
            currsum+= cardPoints[i];
            currsum-=cardPoints[i-windowsize];
            minsum=Math.min(minsum,currsum);
        }
        return maxsum-minsum;
    }
}
