package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {
        
        //Creat secretMessage object
        SecretMessage secretMessage = new SecretMessage("Hello World");

        //Get the secret message
        secretMessage.displayMessage();



        //Temperature
        Temperature temp = new Temperature();
        temp.setCelsius(25);
        System.out.println("Temperature in Celsius: " + temp.getCelsius());
        System.out.println("Temperature in Fahrenheit:"+ temp.getFahrenheit());



        //Grade
        // Create a Grade object with valid input
        Grade grade = new Grade("Andrea", 65, "CS101");

        // Print out student details
        System.out.println("Student Name: " + grade.getStudentName());
        System.out.println("Numeric Grade: " + grade.getNumericGrade());
        System.out.println("Letter Grade: " + grade.calculateLetterGrade());
        System.out.println("Course Code: " + grade.getCourseCode());
 
    }
    }


