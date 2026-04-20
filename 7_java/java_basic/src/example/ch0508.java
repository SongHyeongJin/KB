package example;

public class ch0508 {
    public static void main(String[] args) {
        int[][] array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        float sum=0;
        double avg;
        int num=0;
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length;j++){
                sum+=array[i][j];
                num++;
            }
        }
        avg = sum/num;
        System.out.printf("총합 : %.0f, 평균 : %.1f", sum, avg);
    }
}
