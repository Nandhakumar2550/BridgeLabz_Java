package sorting;

public class SelectionSortScores {

    static void selectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void print(int arr[]){

        for(int num:arr)
            System.out.print(num+" ");
    }

    public static void main(String[] args) {

        int scores[] = {85,72,90,60,88};

        selectionSort(scores);

        print(scores);
    }
}
