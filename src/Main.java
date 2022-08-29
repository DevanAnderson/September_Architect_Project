import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testModule1();
        testModule2();
    }

    private static void testModule1() {
        Scanner scanner = new Scanner(System.in);
        Module1 module1 = new Module1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int a;
        int b;
        int c;
        while (true) {
            while (true) {
                System.out.println("1 - getAtIndex");
                System.out.println("2 - setAtIndex");
                System.out.println("3 - findIndexOf");
                System.out.println("4 - printAll");
                System.out.println("5 - deleteAtIndex");
                System.out.println("6 - expand");
                System.out.println("7 - shrink");
                a = Integer.parseInt(scanner.nextLine());
                if (a > 7 || a < 1) {
                    System.out.println("Enter a value between 1 and 7");
                    continue;
                }
                break;
            }
            switch (a) {
                case 1:
                    System.out.println("Enter index");
                    b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Value at index " + b + " is " + module1.getAtIndex(b));
                    break;
                case 2:
                    System.out.println("Enter index");
                    b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter value");
                    c = Integer.parseInt(scanner.nextLine());
                    module1.setAtIndex(b, c);
                    break;
                case 3:
                    System.out.println("Enter value");
                    b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Index of " + b + " is " + module1.findIndexOf(b));
                    break;
                case 4:
                    module1.printAll();
                    break;
                case 5:
                    System.out.println("Enter index");
                    b = Integer.parseInt(scanner.nextLine());
                    module1.deleteAtIndex(b);
                    break;
                case 6:
                    module1.expand();
                    break;
                case 7:
                    module1.shrink();
                default:
                    break;
            }
            System.out.println("Would you like to continue? 1 for yes, 2 for no");
            a = Integer.parseInt(scanner.nextLine());
            if (a == 1) {
                continue;
            }
            break;
        }
    }

    private static void testModule2() {
        int[][] arr = new int[10][10];
        int ctr = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ctr;
                ctr++;
            }
        }
        Module2 module2 = new Module2(arr);
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        while (true) {
            System.out.println("1 - getAtIndex");
            System.out.println("2 - setAtIndex");
            System.out.println("3 - findIndexOf");
            System.out.println("4 - printAll");
            System.out.println("5 - deleteAtIndex");
            System.out.println("6 - expand");
            System.out.println("7 - shrink");
            a = Integer.parseInt(scanner.nextLine());
            if (a > 7 || a < 1) {
                System.out.println("Enter a value between 1 and 7");
                continue;
            }
            System.out.println("Valid Choice");
            break;
        }
        switch (a) {
            case 1:
                System.out.println("Enter first index");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter second index");
                c = Integer.parseInt(scanner.nextLine());
                System.out.println("Value at index " + b + " is " + module2.getAtIndex(b, c));
                break;
            case 2:
                System.out.println("Enter first index");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter second index");
                c = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter value");
                d = Integer.parseInt(scanner.nextLine());
                module2.setAtIndex(b, c, d);
                break;
            case 3:
                System.out.println("Enter value");
                b = Integer.parseInt(scanner.nextLine());
                int[] temp = module2.findIndexOf(b);
                System.out.println("The value is in row "  + temp[0] + ", column " + temp[1]);
                break;
            case 4:
                module2.printAll();
                break;
            case 5:
                System.out.println("Enter first index");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter second index");
                c = Integer.parseInt(scanner.nextLine());
                module2.deleteAtIndex(b, c);
                module2.printAll();
                break;
            case 6:
                module2.expand();
                break;
            case 7:
                module2.shrink();
            default:
                break;
        }
    }
}