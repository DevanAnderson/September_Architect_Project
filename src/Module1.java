import java.util.Scanner;

public class Module1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a;
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
    }

    //returns a number at the index of the array that was passed in
    //if index is out of bounds, returns -1
    public int getAtIndex(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        }
        System.out.println("Out of bounds");
        return -1;
    }

    //passes in an index, a value, and an array
    //if index is not out of bounds, the array at the index will be set to the
    //
    public void setAtIndex(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
            return;
        }
        System.out.println("Out of bounds");
    }

    public int findIndexOf(int[] arr, int value) {
        for (int j : arr) {
            if (j == value) {
                return value;
            }
        }
        return -1;
    }
    public void printAll(int[] arr){
        String temp = "";
        for (int j : arr) {
            temp = temp + j + ",";
        }
        temp = temp.substring(0,temp.length()-1);
        System.out.println(temp);
    }
    public static int[] deleteAtIndex(int[] arr, int index){
        if (index >= 0 && index < arr.length){
            int[] temp = new int[arr.length-1];
            int j = 0;
            for(int i = 0; i < arr.length; i++){
                if(i != index){
                    temp[i - j] = arr[i];
                }
                else{
                    j = 1;
                }
            }
            return temp;
        }
        System.out.println("Out of bounds");
        return arr;
    }

}
