package Algorithm.S2024.M01_05;


public class 숫자문자열과_영단어 {
    public static void main (String[]args){
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
        System.out.println(solution( "seventwo"));
        System.out.println(solution("one00"));
    }

    public static int solution(String s) {
        String result = "";
        String ans = "";
        String [] arr = s.split("");
        for (int i =0; i<arr.length; i++){
            char num = s.charAt(i);
            if (47 < num && num < 58){ //숫자일경우
                result += num;
                continue;
            }
            ans += num;
            switch (ans){
                case "zero" :
                    result += "0";
                    ans = "";
                    break;

                case "one":
                    result += "1";
                    ans = "";
                    break;

                case "two":
                    result += "2";
                    ans = "";
                    break;

                case "three":
                    result += "3";
                    ans = "";
                    break;

                case "four":
                    result += "4";
                    ans = "";
                    break;

                case "five":
                    result += "5";
                    ans = "";
                    break;

                case "six":
                    result += "6";
                    ans = "";
                    break;

                case "seven":
                    result += "7";
                    ans = "";
                    break;

                case "eight":
                    result += "8";
                    ans = "";
                    break;

                case "nine":
                    result += "9";
                    ans = "";
                    break;
            }
        }
        return Integer.parseInt(result);
    }
}
