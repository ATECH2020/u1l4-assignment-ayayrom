import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();

        //Your code goes here
        int minutes;
        int hours;
        minutes = seconds / 60;
        hours = minutes / 60;
        System.out.print(hours + " " + minutes);
        // closing the scanner object
        scanner.close();
    }
}