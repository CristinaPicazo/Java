//Eclipse
public class StudentProfile {
	//General info of the student
	String firstName;
	String secondName;
	double grade;
	int expectedYearGraduate;

		//Constructor
		public StudentProfile(String firstName, String secondName, double grade, int expectedYearGraduate) {
			this.firstName = firstName;
			this.secondName = secondName;
			this.grade = grade;
			this.expectedYearGraduate = expectedYearGraduate;
		}
		
		//adding one extra year to be graduated
		public void incrementExpectedGraduation(){
			this.expectedYearGraduate = this.expectedYearGraduate + 1;
		}
		
}
