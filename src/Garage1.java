public class Garage1 {
    private int capacity; // Total number of cars that can be parked in the garage.
    private int occupied; // number of cars parked in the garage.
    private int remaining; // remaining number of cars that can be parked.

    // to initilize the capacity of the garage
    public Garage1(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            occupied = 0;
            remaining = capacity;
            System.out.println("The garage has " + capacity + " spaces.");
            System.out.println("the garage is empty in the morning when you start taking notes.");
        } else {
            this.capacity = 0;
            this.occupied = 0;
            this.remaining = 0;
            System.out.println("Invalid values");
        }
        System.out.println();
    }

    // to initilize the capacity and already parked cars in the garage.
    public Garage1 (int capacity, int occupied) {
        if (capacity >= occupied && capacity > 0 && occupied > 0) {
            this.capacity = capacity;
            this.occupied = occupied;
            this.remaining = this.capacity - this.occupied;
            System.out.println("The garage has " + capacity + " spaces.");
            System.out.println(occupied + (occupied == 1 ? " car is" : " cars are") + " in the garage in the morning.");
        } else {
            this.capacity = 0;
            this.occupied = 0;
            this.remaining = 0;
            System.out.println("Invalid values");
        }
        System.out.println();
    }

    // when cars enterd into the garage
    void enter(int cars) {
        if (cars <= 0)
            return;
        if (remaining > cars) {
            System.out.println(cars + (cars == 1 ? " car enters" : " cars enter") + " the garage.");
            occupied += cars;
            remaining -= cars;
        } else {
            System.out.println(remaining + (remaining == 1 ? " car enetrs" : " cars enter") + " the garage.");
            System.out.println("garage is full.");
            System.out.println((cars - remaining) + (cars - remaining == 1 ? " car is" : " cars are") + " sent out.");
            occupied = capacity;
            remaining = 0;
        }
    }

    // when cars leave the garage
    void leave(int cars) {
        if (cars <= 0)
            return;
        if (occupied > cars) {
            System.out.println(cars + (cars == 1 ? " car leaves" : " cars leave") + " the garage.");
            occupied -= cars;
            remaining += cars;
        } else {
            System.out.println(occupied + (occupied == 1 ? " car leaves" : " cars leave") + " the garage.");
            System.out.println("garage is empty.");
            occupied = 0;
            remaining = capacity;
        }
    }

    public static void main(String[] args) {
        Garage1 garage = new Garage1(50, 40);
        garage.enter(3);
        garage.leave(20);
        garage.leave(5);
        garage.enter(4);
        garage.enter(20);
        garage.enter(9);
    }
}




