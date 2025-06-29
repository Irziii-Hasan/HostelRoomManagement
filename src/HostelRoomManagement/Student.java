package HostelRoomManagement;

public class Student extends User{
    private int studentId;
    private String name;
    private String dept;
    private int semester;
    private String status="Not Allocated";


    public Student(int studentId, String name, String dept, int semester) {
        this.studentId = studentId;
        this.name = name;
        this.dept = dept;
        this.semester = semester;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", semester=" + semester +
                ", status='" + status + '\'' +
                '}';
    }
}
