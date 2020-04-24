//Eclipse
public class Main {
	
	public static void main(String[] args) {
	
		//New students
		StudentProfile profileOne = new StudentProfile("Ana", "Pi", 4.8, 2021);
		StudentProfile profileTwo = new StudentProfile("Oscar", "Hernandez", 6.9, 2021);	
				
		//Increment Year
		profileOne.incrementExpectedGraduation();
		
		//Print Info
		System.out.println(profileOne.firstName + " "+profileOne.secondName + " has a grade "+ profileOne.grade + " but, this time, is expecting to be graduated in " + profileOne.expectedYearGraduate + ".");

		System.out.println(profileTwo.firstName + " "+profileTwo.secondName + " has a grade "+ profileTwo.grade + " and is expecting to be graduated in " + profileTwo.expectedYearGraduate + ".");

		
	}


}
