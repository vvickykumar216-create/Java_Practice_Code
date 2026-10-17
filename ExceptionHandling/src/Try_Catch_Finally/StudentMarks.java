package Try_Catch_Finally;

public class StudentMarks {
    static void main(String[] args) {
        int[] marks = {60, 70, 85, 80, 90};
        try {
            System.out.println("Marks: "+ marks[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: Invalid array index");
        }
        System.out.println("Program continues..");
    }
}
