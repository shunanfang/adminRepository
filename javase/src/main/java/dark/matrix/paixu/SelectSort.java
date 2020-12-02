package dark.matrix.paixu;

/**
 * User: 莱利
 * Date: 2020/10/2
 * Description: 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] array = {3,13,1,7,5,11,9};

        for(int i = 0; i < array.length-1; i++){

            int min = i;

            for(int j = i+1; j < array.length; j++ ){
                if(array[j] < array[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
