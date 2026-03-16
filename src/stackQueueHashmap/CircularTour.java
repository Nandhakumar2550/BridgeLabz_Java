package stackQueueHashmap;

class PetrolPump {

    int petrol;
    int distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTour {

    static int findStart(PetrolPump arr[], int n) {

        int start = 0;
        int deficit = 0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {

            capacity += arr[i].petrol - arr[i].distance;

            if (capacity < 0) {
                start = i + 1;
                deficit += capacity;
                capacity = 0;
            }
        }

        return (capacity + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        PetrolPump arr[] = {
                new PetrolPump(6,4),
                new PetrolPump(3,6),
                new PetrolPump(7,3)
        };

        System.out.println(findStart(arr,3));
    }
}
