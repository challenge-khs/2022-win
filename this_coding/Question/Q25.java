import java.util.*;

class Solution {
    static class Node {
        double rate;
        int index;
        
        public Node(double rate, int index) {
            this.rate = rate;
            this.index = index;
        }
    }
    public int[] solution(int N, int[] stages) {
        int k = stages.length;
        int[] answer = new int[N];
        Double[] rate = new Double[N + 1];
        ArrayList<Node> arr = new ArrayList<>();
        
        for(int i = 1; i <= N; i++) {
            int cnt = 0;
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] == i)
                    cnt++;
            }
            
            if(cnt == 0)
                rate[i] = (double)0;
            else {
                rate[i] = (double)cnt / k;
                k = k - cnt;
            }
            arr.add(new Node(rate[i], i));
        }
        
        Collections.sort(arr, ((o1, o2) -> Double.compare(o2.rate, o1.rate)));
        
        for(int i = 0; i<arr.size(); i++) {
            answer[i] = arr.get(i).index;
        }
        
        return answer;
    }
}
