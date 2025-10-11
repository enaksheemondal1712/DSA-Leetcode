class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> matrix = new ArrayList<>();
        int i = 0;


        while( i < n ) {
            if( intervals[i][1] < newInterval[0] ) {
                matrix.add( intervals[i] );
            }
            else if( intervals[i][0] > newInterval[1] ) {
                break;
            }
            else{
                
                newInterval[0] = Math.min( newInterval[0], intervals[i][0] );
                newInterval[1] = Math.max( newInterval[1], intervals[i][1] );

            }

            i += 1;
        }

        matrix.add(newInterval);
        while( i < n ) {
            matrix.add(intervals[i]);
            i += 1;
        }

        n = matrix.size();
        int[][] arr = new int[n][2];
        for( i = 0; i < n; i++ ){
            arr[i][0] = matrix.get(i)[0];
            arr[i][1] = matrix.get(i)[1];
        }


        return arr;
 
    }
}