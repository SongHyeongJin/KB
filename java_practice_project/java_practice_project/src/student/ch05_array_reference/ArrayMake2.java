package student.ch05_array_reference;

public class ArrayMake2 {
    public static void main(String[] args) {
        //배열의 선언과 값을 한번에 할당
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //데이터가 "Spring", "Summer", "Fall", "Winter"

        String [] season = {"Spring", "Summer", "Fall", "Winter"};
        season[2] = "Winter2";
        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }

    }
}
