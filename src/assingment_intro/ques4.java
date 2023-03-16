package assingment_intro;
public class ques4 {
    public static void main(String[] args){
        int[][] arr= {{2,3,6},{4,5,7},{1,8,9}} ;

        for(int i = 0; i <arr.length; i++){
            int r_sum=0;
            for(int j=0;j<arr.length;j++){
                r_sum+=arr[i][j];
            }
            System.out.println("sum of row "+i+" is "+r_sum);
        }

        for(int i=0;i< arr[0].length;i++){
            int c_sum=0;
            for(int j=0;j< arr.length;j++){
                c_sum+=arr[j][i];
            }
            System.out.println("sum of column "+i+" is "+c_sum);

        }
    }
}
