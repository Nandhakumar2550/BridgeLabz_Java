package sorting;

public class InsertionSortEmployees {

    static void insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    static void print(int arr[]){

        for(int num:arr)
            System.out.print(num+" ");
    }

    public static void main(String[] args) {

        int ids[] = {105,102,110,101,108};

        insertionSort(ids);

        print(ids);
    }
}
