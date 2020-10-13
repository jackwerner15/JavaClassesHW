import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        pet Dog = new pet("Winston", 8, "CT", "Dog");

        System.out.println("The pet is a "+ Dog.getType());
        

        Dog.getName();
        Dog.getAge();
        Dog.changeAge(14);
        Dog.changeName("Mickey");
        System.out.println("\n --------------- \n");
        Dog.getName();
        Dog.getAge();


        System.out.println("\n --------------- \n");


        College college = new College("Denison", 2500, "Ohio");
		String gifts = "wonderful";
		System.out.println(college.tourGuide(gifts));
		College.message();
        System.out.println("At "+college.getName()+ " University, "+college.getStudents()+" students attend, located in " + college.getLocation());
    

      
     
    }

}