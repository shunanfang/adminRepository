package dark.matrix.paixu;

/**
 * User: 莱利
 * Date: 2020/10/2
 * Description:  冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args){

        //定义一个数组
        int[] array = {3,1,7,5,9,13,11};

        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
               if(array[j] > array[j+1]){
                   int temp = 0;

                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
            }
        }

        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
