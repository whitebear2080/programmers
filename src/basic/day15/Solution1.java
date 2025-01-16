package basic.day15;

/*
조건에 맞게 수열 변환하기 1
제출 내역
문제 설명
정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000,000
1 ≤ arr의 원소의 값 ≤ 100
입출력 예
arr	result
[1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
입출력 예 설명
입출력 예 #1

1, 3은 50 미만의 홀수 이므로 2를 곱하고, 100, 98은 50 이상의 짝수이므로 2로 나눕니다.
나머지 값들은 변경 조건에 해당하지 않으므로 바꾸지 않습니다.
따라서 [2, 2, 6, 50, 99, 49]를 return 합니다.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.stream(
                        solution(new int[]{1, 2, 3, 100, 99, 98}))
                        .boxed()
                        .collect(Collectors.toList())
        );
    }

    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(n -> (n >= 50 && n % 2 == 0) ? n /= 2 : (n < 50 && n % 2 != 0) ? n *= 2 : n)
                .toArray();
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= FIFTY && arr[i] % 2 == 0) arr[i] /= 2;
            else if (arr[i] < FIFTY && arr[i] % 2 != 0) arr[i] *= 2;
        }
        return arr;
        */
    }
}
