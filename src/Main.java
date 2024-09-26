import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    //class AgeChecker
	//  main()
	//	    num ageNumber
	//	    num bandNumber = 21
	//	    output “Please enter your age:”
	//	    input ageNumber
	//   if ageNumber >= bandNumber
	//	        output “This person gets a wrist band”
	//   end if
	//  return
    //endClass


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age: ");

        int ageNumber = 0;
        String trash = "";


        if (in.hasNextInt())
        {
            ageNumber = in.nextInt();
            if (ageNumber >= 21)
            {
                System.out.println("This person gets a Wristband ");
            }
            else{
                System.out.println("This person doesn't get a Wristband ");
            }
        }
        else
        {
            trash = in.nextLine();
          System.out.println("Error, not a valid age, you input: " + trash);
        }
    }
}


