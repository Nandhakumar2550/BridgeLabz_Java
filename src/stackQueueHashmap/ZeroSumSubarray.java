package stackQueueHashmap;

import java.util.HashMap;

public class ZeroSumSubarray {

    static boolean hasZeroSum(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;

        for(int num:arr){

            sum += num;

            if(sum == 0 || map.containsKey(sum))
                return true;

            map.put(sum,1);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {4,2,-3,1,6};

        System.out.println(hasZeroSum(arr));
    }
}
