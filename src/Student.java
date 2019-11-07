import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int [] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        array = new int[size];
        for (int i =0; i<size;i++){
            System.out.println("enter the element" +( i+1 ) + " of array: ");
            array[i]= input.nextInt();
        }
        for (int j =0; j<array.length; j++){
            System.out.print(array[j] +"\t");
        }
        int count =0;
        for (int k =0;k<size;k++){
            if (array[k] >5 && array[k]<10){
                count ++;
            }
        }
        System.out.println("Volumes of student pass the exam is: " + count);
    }
}
