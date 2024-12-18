package array;

public class Student {
    public static int serialNum = 1000;
    public String name;
    public int studentID;

    Student (String name){
        studentID = serialNum;
        serialNum++;
        this.name = name;
    }

    public void showInfo(){
        System.out.println(studentID + ", " + name);
    }
}
