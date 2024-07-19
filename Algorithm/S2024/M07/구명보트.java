package Algorithm.S2024.M07;

import java.util.Arrays;

public class 구명보트 {
    public static void main (String[]args){
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        int[] people2 = {70, 80, 50};
        int limit2 = 100;

        System.out.println(solution(people1,limit1));
        System.out.println(solution(people2, limit2));
    }

    public static int solution(int[] people, int limit) {
        // 사람들의 몸무게 배열을 오름차순으로 정렬
        Arrays.sort(people);

        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스
        int boats = 0; // 필요한 보트의 수

        // 두 포인터가 만나기 전까지 반복
        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람을 같이 태울 수 있는 경우
            if (people[left] + people[right] <= limit) {
                left++; // 가장 가벼운 사람을 보트에 태움
            }
            // 가장 무거운 사람을 보트에 태움
            right--;
            // 보트의 수 증가
            boats++;
        }

        return boats;
    }
}
