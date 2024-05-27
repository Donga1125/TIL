package Algorithm.S2024;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = decodeMap(n, arr1, arr2);
        for (String line : result) {
            System.out.println(line);
        }
    }

    public static String[] decodeMap(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            // 두 배열의 각 원소를 이진수로 변환하고 OR 연산을 수행
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 길이가 n이 되도록 앞에 0을 채움
            binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            // 이진수 문자열을 #과 공백으로 변환
            map[i] = binaryString.replace('1', '#').replace('0', ' ');
        }

        return map;
    }
}
