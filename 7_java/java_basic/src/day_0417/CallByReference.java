package day_0417;

class AddArray{
    public  int addArray(int[] arrayRefer){
        int totalsum=0;
        for(int i=0; i<arrayRefer.length; i++){
            totalsum+=arrayRefer[i];
        }
        return totalsum;
    }
    static final int value = 3;
}
public class CallByReference {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        //배열의 총합을 구하여 출력하세요
        AddArray hj = new AddArray();
        int result = hj.addArray(a);
        int number = AddArray.value;
        System.out.println("총합 : " +result);
    }
//    public static int addArray(int[] arrayRefer){
//        int totalsum=0;
//        for(int i=0; i<arrayRefer.length; i++){
//            totalsum+=arrayRefer[i];
//        }
//        return totalsum;
//    }
}
