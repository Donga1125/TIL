package Algorithm.S2024;

public class 푸드파이트대회 {
    public static void main (String [] args){
        System.out.println(solution(new int[]{1, 3, 4, 6}));
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        StringBuilder leftSide = new StringBuilder();
        StringBuilder rightSide = new StringBuilder();

        // food[0]은 물로 항상 1개, 배치할 필요가 없음
        for (int i = 1; i < food.length; i++) {
            int half = food[i] / 2;
            for (int j = 0; j < half; j++) {
                leftSide.append(i);
                rightSide.insert(0, i);  // rightSide의 맨 앞에 추가
            }
        }

        // 중앙에 물(0)을 배치하고 좌우 합치기
        return leftSide.toString() + "0" + rightSide.toString();
    }
}
