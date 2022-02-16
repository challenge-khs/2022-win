//https://programmers.co.kr/learn/courses/30/lessons/60057

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i = 1; i < (s.length() / 2) + 1; i++) {
            String output = "";
            String prev = s.substring(0, i);
            int cnt = 1;
            for(int j = i; j < s.length(); j += i) {
                String sub = "";
                for(int k = j; k < j + i; k++) {
                    if(k < s.length())
                        sub += s.charAt(k);
                }
                if(prev.equals(sub))
                    cnt ++;
                else {
                    output += (cnt >= 2)? cnt + prev : prev;
                    sub = "";
                    for(int k = j; k < j + i; k++) {
                        if(k < s.length())
                            sub += s.charAt(k);
                    }
                    prev = sub;
                    cnt = 1;
                }
            }
            output += (cnt >= 2)? cnt + prev : prev;
            answer = Math.min(answer, output.length());
        }
        
        return answer;
    }
}
