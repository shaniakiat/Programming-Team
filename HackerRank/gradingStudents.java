import java.util.Scanner;

class gradingStudents{
    public static void main(String[] args){
        int[] grades = {33};

        for(int i = 0; i < grades.length; i++){
            if(grades[i] < 38){
                System.out.println(grades[i]);
            } else if(((grades[i] - grades[i]%5) + 5) - grades[i] < 3){
                // System.out.println(grades[i]%5);
                System.out.println((grades[i]-(grades[i]%5))+5);
            } else{
                System.out.println(grades[i]);
            }
        }

    }
}