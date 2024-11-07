package ie.atu.encapsulation;

public class Grade {

    private String studentName;
    private int numericGrade;
    private String courseCode;


// Constructor with validation
public Grade(String studentName, int numericGrade, String courseCode) {
    this.studentName = validateStudentName(studentName);  // Validate student name
    this.numericGrade = validateGrade(numericGrade);      // Validate grade
    this.courseCode = validateCourseCode(courseCode);    // Validate course code
}

// Getter for studentName
public String getStudentName() {
    return studentName;
}

// Setter for studentName with validation
public void setStudentName(String studentName) {
    this.studentName = validateStudentName(studentName);
}

// Getter for numericGrade
public int getNumericGrade() {
    return numericGrade;
}

// Setter for numericGrade with validation
public void setNumericGrade(int numericGrade) {
    this.numericGrade = validateGrade(numericGrade);
}

// Getter for courseCode
public String getCourseCode() {
    return courseCode;
}

// Setter for courseCode with validation
public void setCourseCode(String courseCode) {
    this.courseCode = validateCourseCode(courseCode);
}

// Validation helper method for studentName
private String validateStudentName(String studentName) {
    if (studentName == null || studentName.trim().isEmpty()) {
        throw new IllegalArgumentException("Student name cannot be empty.");
    }
    return studentName;
}

// Validation helper method for numericGrade (validates that the grade is between 0 and 100)
private int validateGrade(int grade) {
    if (grade < 0 || grade > 100) {
        throw new IllegalArgumentException("Grade must be between 0 and 100.");
    }
    return grade;
}

// Validation helper method for courseCode (e.g., "CS101")
private String validateCourseCode(String courseCode) {
    if (courseCode == null || !courseCode.matches("[A-Za-z]{2}\\d{3}")) {
        throw new IllegalArgumentException("Course code must be in the format XX123 (e.g., CS101).");
    }
    return courseCode;
}

// Method to calculate letter grade based on numeric grade
public String calculateLetterGrade() {
    if (numericGrade >= 90) {
        return "A";
    } else if (numericGrade >= 80) {
        return "B";
    } else if (numericGrade >= 70) {
        return "C";
    } else if (numericGrade >= 60) {
        return "D";
    } else {
        return "F";
    }
}

// Optional: Static method to check if a grade is valid (0-100)
public static boolean isValidGrade(int grade) {
    return grade >= 0 && grade <= 100;
}

// Optional: Static method to check if a course code is valid
public static boolean isValidCourseCode(String courseCode) {
    return courseCode != null && courseCode.matches("[A-Za-z]{2}\\d{3}");
}
}