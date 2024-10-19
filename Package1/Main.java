package Package1;

import java.util.Scanner;

class Bus_reservation {
    static int n = 20;
    static int seats[] = new int[n];

    public void reserveSeat() {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Available seat numbers are: ");
            for (int i = 0; i < n; i++) {
                if (seats[i] == 0) {
                    System.out.println("seat: " + i + " ");
                    flag = 1;
                }
            }
            System.out.println();
            System.out.println("Select seat: ");
            int k = sc.nextInt();
            if (seats[k] == 0) {
                System.out.println("Seat " + k + " reserved successfully");
                seats[k] = 1;
            } else {
                System.out.println("seat not available. Choose from available seats.");
                System.out.println("Available seats are: ");
                for (int i = 0; i < n; i++) {
                    if (seats[i] == 0) {
                        System.out.print("seat: " + i + " ");
                    }
                }
            }
        } else {
            System.out.println("Seats Filled!!");
            return;
            // System.exit(flag);
        }
        System.out.println();
    }

    public void cancelReservation() {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Booked Seats are: ");
            for (int i = 0; i < n; i++) {
                if (seats[i] == 1) {
                    System.out.println("seat: " + i + " ");
                }
            }
            System.out.println();

            System.out.println("Enter seat number to cancel:");
            int k = sc.nextInt();
            if (seats[k] == 1) {
                System.out.println("Reservation Cancelled!");
                seats[k] = 0;
            } else {
                System.out.println("This seat number is not booked yet!");

            }
        } else {
            System.out.println("No seats Booked till.");
            return;
        }
        System.out.println();
    }

    public void viewAvailable() {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Available seat numbers are:  ");
            for (int i = 0; i < n; i++) {
                if (seats[i] == 0) {

                    System.out.println("seat: " + i + " ");
                }
            }

        } else {
            System.out.println("No seats Available.");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Bus_reservation b = new Bus_reservation();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Reserve Seat");
            System.out.println("2. Cancel reservation");
            System.out.println("3. View Available Seats");
            System.out.println("4. Exit");
            System.out.println("Select ur choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    b.reserveSeat();
                    break;
                case 2:
                    b.cancelReservation();
                    break;
                case 3:
                    b.viewAvailable();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice..");
                    break;
            }
        }
    }
}
