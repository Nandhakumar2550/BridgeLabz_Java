package sorting;

public class CountingSortAges {

    static void countingSort(int arr[]){

        int max = 18;
        int count[] = new int[max+1];

        for(int num:arr)
            count[num]++;

        int index = 0;

        for(int i=0;i<=max;i++){

            while(count[i] > 0){

                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void print(int arr[]){

        for(int num:arr)
            System.out.print(num+" ");
    }

    public static void main(String[] args) {

        int ages[] = {15,12,18,14,12,16};

        countingSort(ages);

        print(ages);
    }
}
