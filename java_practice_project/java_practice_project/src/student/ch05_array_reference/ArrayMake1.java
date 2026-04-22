package student.ch05_array_reference;

public class ArrayMake1 {
    public static void main(String[] args) {
        //정수 배열에 5개의 숫자 1, 2, 3, 4, 5를 할당

//        int[] arr ={1,2,3,4,5};
        int[] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
