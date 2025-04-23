public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 4,2,1,4};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            while (arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;

            }
            if (arr[arr[i]] == arr[i]) {
                System.out.println(i);
                break;
            }

//            System.out.println(arr);
        }
//        System.out.println(count);
    }
}