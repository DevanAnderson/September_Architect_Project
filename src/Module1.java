public class Module1 {
    private int[] arr;

    public Module1(int[] arr){
        this.arr = arr;
    }

    //returns a number at the index of the array that was passed in
    //if index is out of bounds, prints out of bounds and returns -1
    public int getAtIndex(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        }
        System.out.println("Out of bounds");
        return -1;
    }

    //passes in an index, a value, and an array
    //if index is in bounds, the array at the index will be set to the
    //value variable passed in
    public void setAtIndex(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
            return;
        }
        System.out.println("Out of bounds");
    }

    //searches the array that was passed in, and returns first index of the value passed in
    public int findIndexOf(int value) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    //goes through the array and separates each value in the array with a ","
    //then prints out the contents in the array
    public void printAll(){
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            temp = temp + arr[i] + ",";
        }
        temp = temp.substring(0,temp.length()-1);
        System.out.println(temp);
    }

    //creates a new array with length of passed in array - 1, then in the new array,
    //passes in values of passed in array. When index is reached, it skips and assigns
    //the next value of the passed in array to new array
    public void deleteAtIndex(int index){
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
            arr = temp;
            return;
        }
        System.out.println("Out of bounds");
    }

    //adds an index to the back of the array and assigns it the value of 0
    public void expand(){
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i <arr.length; i++){
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = 0;
        arr = temp;
    }

    //removes the last index of the array
    public void shrink(){
        int[] temp = new int[arr.length - 1];
        for(int i = 0; i <temp.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
