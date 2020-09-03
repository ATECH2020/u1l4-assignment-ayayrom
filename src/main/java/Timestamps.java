import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        //code
        int hoursTotal;
        int minutesTotal;
        int secondsTotal;
        int timeBetween;
        hoursTotal = hours2 - hours1;
        minutesTotal = minutes2 - minutes1;
        secondsTotal = seconds2 - seconds1;
        
        timeBetween = (((hoursTotal)*60)*60) + ((minutesTotal)*60) + secondsTotal;
        
        System.out.println(timeBetween);

        // closing the scanner object
        scanner.close();
    }
}