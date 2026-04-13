package inheritance;

// Base class representing a generic device
public class Device {

    // Unique ID of the device
    int deviceId;

    // Current status of the device (e.g., ON/OFF)
    String status;
}

// Thermostat class inheriting from Device
class Thermostat extends Device {

    // Temperature setting for the thermostat
    int temperatureSetting;

    void displayStatus() {

        // Display device ID (inherited)
        System.out.println("Device ID: " + deviceId);

        // Display device status (inherited)
        System.out.println("Status: " + status);

        // Display temperature setting (specific to Thermostat)
        System.out.println("Temperature: " + temperatureSetting);
    }
}