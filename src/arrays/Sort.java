package arrays;

/**
 * Created by ${fk}
 * on 14:28 2018/3/2
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 2, 3, 9, 4, 5, 7, 8};
        System.out.println("排序之前");
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        if (i == arr.length-1){
            System.out.println();
        }
        System.out.println("排序之后");
        Sort.bubbleSort(arr);
        for (i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
