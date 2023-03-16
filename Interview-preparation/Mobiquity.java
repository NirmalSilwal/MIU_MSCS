package Mobiquity;

/*
[12:40 PM] 
Find the missing number in the following array
int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};

 */
public class Mobiquity {

    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,9, 10,12};
        int[] numbers = {8,9, 11,12,13,14,15};
        int answer = findMissing1(numbers);
        System.out.println(answer);
    }

    private static int findMissing1(int[] numbers) {
        int low = numbers[0], high = numbers[numbers.length - 1];
        int xorValue = 0;
        for (int n : numbers) {
            xorValue ^= n;
        }

        for (int i = low; i <= high; i++) {
            xorValue ^= i;
        }
        return xorValue;
    }
     
}
