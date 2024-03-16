package Algorithm.S2024;

import java.util.Arrays;

public class 전화번호목록 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 전화번호를 사전순으로 정렬하여 비교

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 전화번호가 다음 전화번호의 접두사인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

}
