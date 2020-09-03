import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        //code
        int totalDesks;
        if (class1 % 2 != 0)
        {
          class1++;
          class1 = class1/2;
        }
        else
        {
          class1 = class1/2;
        }
        if (class2 % 2 != 0)
        {
          class2++;
          class2 = class2/2;
        }
        else
        {
          class2 = class2/2;
        }
        if (class3 % 2 != 0)
        {
          class3++;
          class3 = class3/2;
        }
        else
        {
          class3 = class3/2;
        }
        totalDesks = class1+class2+class3;
        System.out.println(totalDesks);
        // closing the scanner object
        scanner.close();
    }
}