package Array;

public class array {
    public static void main(String[] args){
        int [] arr=new int[10];
        int [] arr1={1,2,3,4};
        System.out.println(arr1);
        int  max1=Integer.MIN_VALUE;
//        for(int i:arr1){
//            System.out.println(i);
//            max1=Math.max(max1,i);
//        }
//        System.out.println(max1);

        //2d Array

        int [][] arr3=new int[5][5];
        int [][] matrix= {
                {1,2,3,4},
                {4,5,6,4},
                {6,7,7,5}
        };


      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              System.out.println(matrix[i][j]);
          }
      }







    }
}
