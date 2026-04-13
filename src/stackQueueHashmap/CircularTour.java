package stackQueueHashmap;

class PetrolPump {

    // Amount of petrol available at this pump
    int petrol;

    // Distance to next petrol pump
    int distance;

    // Constructor to initialize petrol and distance
    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTour {

    // Method to find starting petrol pump index
    static int findStart(PetrolPump arr[], int n) {

        // Starting index of tour
        int start = 0;

        // Tracks shortage of petrol
        int deficit = 0;

        // Current petrol balance
        int capacity = 0;

        // Traverse all petrol pumps
        for (int i = 0; i < n; i++) {

            // Add petrol gained and subtract distance cost
            capacity += arr[i].petrol - arr[i].distance;

            // If capacity becomes negative, cannot start from current start
            if (capacity < 0) {

                // Move start to next pump
                start = i + 1;

                // Add deficit (negative balance)
                deficit += capacity;

                // Reset capacity
                capacity = 0;
            }
        }

        // Check if total petrol >= total distance
        return (capacity + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        // Array of petrol pumps (petrol, distance)
        PetrolPump arr[] = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        // Find and print starting index
        System.out.println(findStart(arr, 3));
    }
}