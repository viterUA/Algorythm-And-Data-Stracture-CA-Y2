import java.util.Arrays;

//Mykhailo Hnylytskyi T00257938
public class student_MykhailoHnylytskyi {
    public static void main(String[] args) {
        //1. Created a new Java file called student_MykhailoHnylytskyi.java
        //2. Created and instantiate the grades array
        int[] grades = {56,40,82,59,68,77,32,59};
        //Question 2 Outputs
        System.out.println("Question 2");
        //3(b) Using maxGrade() method found the max value of grades array and print it out
        System.out.println("3.The max grade is: " + maxGrade(grades));
        //4(b) Using calculateAverage() method found the average of grades and print it in decimal format of 0.2
        System.out.println("4.The average grade is: " + String.format("%.2f", calculateAverage(grades)));
        //5(b) Using sum() method sum all grades and print out result
        System.out.println("5.The sum of grade is: " + sum(grades));
        //6(b) Using countOccur() method to count target value in array and print it out
        System.out.println("6. The count number of occurrences of grade 59 is: " + countOccur(grades, 59));
        //Question 3 Outputs
        System.out.println("Question 3");

        //int result take the value of index of target
        int result = linearSearch(grades, 77);
        //if result returns with -1 it goes with error
        if(result == -1){
            System.out.println("Error! No such student! Please re-enter the value!");
        }
        //else goes with answer in which position is target
        else{
            System.out.println("1. Using LinearSearch function student to search for grade with value of 77\nIt is in index: " + result);
        }
        //2. Test how it will be print out using selectionSort() method
        System.out.print("2. Using Selection sort method output of sorted array is: " );
        //Sort array at this time
        selectionSort(grades);
        //Print it out with for loop and space between numbers
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

    }
    //Question 2 Methods
    //3(a) Method of maxGrade()
    public static int maxGrade(int[] grades) {
        //Needs to find max, it takes 0 index of grades array so it can compare to other numbers to take them value
        int max = grades[0];
        //for loop grades array length it goes all way to last index and populate max with value of max number in array
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        //return max with maximum value in array
        return max;
    }
    //4(a). Method to calculate average value of grades
    public static double calculateAverage(int[] grades) {
        //It's take sum of all grades in one double sum
        double sum = 0;
        //For loop to sum all grades to sum
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        //Return sum of grades dividing to array length, it means we reached average value
        return sum / grades.length;
    }
    //5(a). Method to sum value of grades
    public static int sum(int[] grades) {
        //It's take sum of all grades in one int sum
        int sum = 0;
        //For loop to sum all grades to sum
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        //Return sum of grades
        return sum;
    }
    //6(a). Method to count picked value in array grades
    public static int countOccur(int[] grades, int target) {
        //int count set to increment it value each time when for loop reached the target
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            //if target grades[index] equals target then count increment +1
            if (grades[i] == target) {
                count++;
            }
        }
        //return sum of counts when target was in the array
        return count;
    }
    //Question 3 Methods
    //1. LinearSearch() method to search for a student grade in the array, it goes from left to right to found target
    public static int linearSearch(int[] grades, int target) {
        /*For loop goes from index 0 to end of grade length and if it found target
         then it return with index of the value it positioned*/
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                return i;
            }
        }
        //If target out of array it goes to -1 value and can be print as an error
        return -1;
    }
    //2(a). Using selectionSort() to sort array
    public static void selectionSort(int[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            int mid = i;
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[j] < grades[mid]) {
                    mid = j;
                }
            }
            int temp = grades[i];
            grades[i] = grades[mid];
            grades[mid] = temp;
        }
    }
    public boolean isSorted(int[] grades) {
        boolean result = false;
        String text = "";
        for (int i = 0; i < grades.length - 1; i++) {
            if (grades[i] > grades[i + 1]) {
                return result = true;
            }
        }
        return result = false;
    }
}
