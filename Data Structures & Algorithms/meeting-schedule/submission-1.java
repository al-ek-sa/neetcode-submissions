/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Set<Integer> set = new HashSet<>();
        int a = 0;
        int b = 0;
        for(int i = 0; i < intervals.size(); i++){
            a = intervals.get(i).start;
            b = intervals.get(i).end;
            while(a < b){
                if(set.contains(a)) return false;
                set.add(a);
                a++;
            }
        }
        return true;
    }
}
