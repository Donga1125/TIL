package Algorithm.S2024.M08;

public class 큰수만들기 {
    public static void main (String[] args){
        //처음부터 남은 자릿 수 중에서 가장 큰 숫자를 찾아서 차례대로 선택
        //선택한 숫자는 다시 선택 x
        //최종적으로 만들어진 문자열이 가장 큰 숫자가 됨

        System.out.println(solution("1924", 2));
        System.out.println(solution("1231234", 3));
        System.out.println(solution("4177252841", 4));


    }

    public static String solution(String number, int k) {

        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<number.length()-k; i++){
            char max = 0;
            for (int j =index; j<= i+k; j++){
                if (max < number.charAt(j)){
                    max = number.charAt(j);
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
