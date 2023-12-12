package Algorithm;

public class 제일작은수제거하기 {
    //리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
    public static void main(String args[]) {

        System.out.println(solution(new int[]{4,3,2,1}));
    }

    public static int[] solution(int[] arr) {

        if (arr.length == 1){
            return new int []{-1};
        }

        int[] answer = new int[arr.length -1];
        int min = arr[0];
        int idx = 0;

        for (int i=0; i<arr.length; i++){ //최솟값 찾기
            if(min > arr[i]){
                min = arr[i];
            }
        }

        //최솟값을 제외한 배열 생성
        for (int i =0; i< arr.length; i++){
            if (arr[i] != min){
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }

}
