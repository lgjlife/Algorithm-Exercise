package book5.ch1;

import utils.TimeDelayUtil;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 *功能描述
 * @author lgj
 * @Description  二分查找算法
 * @date 3/29/19
*/
public class BinarySearch {


    public static  Integer search(int[] array,int data){
        int index  = 0;
        int left = 0;
        int right = array.length-1;

        if (array == null){
            throw  new NullPointerException();
        }

        int mid = (left + right) >> 1;
        System.out.println("left = " + left + "  right = " + right);
        System.out.println("mid = " + mid);
        while(left <= right){

            if(data == array[mid]){
                return mid;
            }
            // in left
            else if(( data >= array[left] ) &&(data < array[mid])){
                right = mid-1;
            }

            // in right
            else if((data > array[mid]) && ( data <= array[right] )){
                left = mid+1;
            }
            else {

                System.out.println("the data is not found");
                return  null;
            }

            mid = (left + right) >> 1;



            System.out.println("left = " + left + "  right = " + right);
            System.out.println("mid = " + mid);

        }


        return  null;
    }

    public static void main(String args[]){


        int[]  array = new int[100];
        for(int i = 0; i< 100; i++){
            array[i] = i;
        }

        int index = search(array,99);
        System.err.println("index = " + index);
        System.err.println("data = " + array[index]);

    }
}
