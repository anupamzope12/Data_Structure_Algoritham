package Stack_Exam;

public class Students {
	private int studentId;
	private String studentName;
	private double student_marks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudent_marks() {
		return student_marks;
	}
	public void setStudent_marks(double student_marks) {
		this.student_marks = student_marks;
	}
	
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", student_marks=" + student_marks
				+ "]";
	}
	public Students(int studentId, String studentName, double student_marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.student_marks = student_marks;
	}
}