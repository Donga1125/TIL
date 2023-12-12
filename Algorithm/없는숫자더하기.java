package Algorithm;

public class 없는숫자더하기 {

    public static void main(String args[]) {

        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        for (int i =0; i<10; i++){
            for(int j = 0; j<numbers.length; j++){
                if (numbers[j] == i){
                    break;
                }
                if (numbers.length -1 == j){ //입력받은 배열 끝까지 돌았는데 숫자가 없을 때 더해줌
                    answer += i;
                }
            }
        }
        return answer;
    }
}
