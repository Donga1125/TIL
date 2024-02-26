package Algorithm.S2024;
import java.util.*;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
            long[] answer = new long[n];

            long current = x;
            for (int i = 0; i < n; i++) {
                answer[i] = current;
                current += x;
            }

            return answer;
        }
    }


