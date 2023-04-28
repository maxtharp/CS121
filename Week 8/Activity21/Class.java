package Activity21;

public class Class {
    private int studentCount;
    private int roomNum;
    private String courseName;
    private static int classCount = 0;

    public Class(int studentCount, int roomNum, String courseName){
        this.studentCount = studentCount;
        this.roomNum =  roomNum;
        this.courseName = courseName;
        classCount++;
    }
    public static int getClassCount() {
        return classCount;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public int getRoomNum() {
        return roomNum;
    }
    public String getCourseName() {
        return courseName;
    }
}
