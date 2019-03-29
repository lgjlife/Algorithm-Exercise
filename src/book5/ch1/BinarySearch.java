package book5.ch1;

import utils.TimeDelayUtil;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 *功能描述
 * @author lgj
 * @Description  二分查找算法  O(logN)
 * @date 3/29/19
*/
public class BinarySearch {

    private  static  int  searchTimes = 0;

    public static  Integer search(int[] array,int data){
        searchTimes = 0;
        int index  = 0;
        int left = 0;
        int right = array.length-1;

        if (array == null){
            throw  new NullPointerException();
        }

        int mid = (left + right) >> 1;
       // System.out.println("left = " + left + "  right = " + right);
       // System.out.println("mid = " + mid);
        while(left <= right){
            searchTimes++;
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



           // System.out.println("left = " + left + "  right = " + right);
           // System.out.println("mid = " + mid);

        }


        return  null;
    }

    public static void main(String args[]){


        int[]  array = new int[400000000];

        for(int i = 0; i< array.length; i++){
            array[i] = i;
        }

        int index = search(array,99);
        System.err.println("数组长度：" +  array.length +"  搜索次数:" + searchTimes);
        System.err.println("index = " + index);
        System.err.println("data = " + array[index]);

    }
}
