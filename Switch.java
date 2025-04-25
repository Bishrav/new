

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day you want");
        int day = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the day you want");
        int activity = sc1.nextInt();
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7: switch(activity){
                case 1:
                System.out.println("college day");
                break;
                default:
                System.out.println("off");
                break;
            }
            default:
                System.out.println("No days found");;
        }
    }
}
