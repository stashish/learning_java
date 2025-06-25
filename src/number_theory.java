import java.util.Arrays;

public class number_theory {
    static int common_factors(int a, int b) {
        int count = 1;
        int min_number = Math.min(a, b);
        for (int i = 2; i <= min_number; i++) {
            if(a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

    static boolean is_factorial(int n) {
        int fact = 1;
        int temp = 1;
        while(fact <= n) {
            fact = fact * temp;
            if (fact == n) {
                return true;
            }
            temp++;
        }
        return false;
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] arr = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
        // int[] ans = digits;
        // int n = digits.length - 1;
        // if (digits[n] < 9) {
        //     ans[n] = digits[n] + 1;
        //     return ans;
        // }
        // if (digits[0] == 0) {
        //     int[] ans = new int[digits.length + 1];
        //     ans[0] = 1;
        // }
        // for (int i = n; i >= 0; i--) {
        //     if (ans[i] == 9) {
        //         ans[i] = 0;
        //         if (i == 0) {

        //             break;
        //         }
        //     } else {
        //         ans[i] = ans[i] + 1;
        //         break;
        //     }
        // }
        // return ans;
    }

    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * power(num, pow-1);
    }

    public static void main(String[] args) {
//        System.out.println(common_factors(26, 39));
//        System.out.println(is_factorial(5));
//        int[] arr = new int[2];
//        arr[0] = 9;
//        arr[1] = 9;
//        System.out.println(Arrays.toString(plusOne(arr)));
//        System.out.println(power(2, 5));
        String s = "Ashish";
        System.out.println(s.charAt(0));
    }
}
