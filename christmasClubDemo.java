package ChristmasClub;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class christmasClubDemo {
    public static void main(String[] args) {

        ArrayList<String> member = new ArrayList<String>();

        member.add("Gary");
        member.add("Tony");
        member.add("Rubiya");
        member.add("Steve");

        ArrayList<Integer> contribution = new ArrayList<Integer>();

        contribution.add(25);
        contribution.add(20);
        contribution.add(22);
        contribution.add(18);

        for (String string : member) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String userInput = keyboard.nextLine();
            if (string.equals(userInput)) {
                System.out.println(contribution);
                break;

            }
        }


        System.out.println("All of the members and their contributions:" + member + contribution);

        int[] i = {25, 20, 22, 18};
        int sum = IntStream.of(i).sum();
        System.out.println("The total amount of all contributions is: £" + sum);

        int turkeyamount = sum / 10;
        System.out.println("The amount of turkeys that can be bought is: " + turkeyamount);
    }
}

