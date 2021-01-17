import java.util.Scanner;
public class Calculator
{
    int firstNumber,secondNumber;
    int userChoice;
    int result;

    public void takingInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber=sc.nextInt();
        System.out.println("Enter second number: ");
        secondNumber=sc.nextInt();
        System.out.println("Enter 1 to Add,2 to Subtract ,3 to Multiply,4 to Divide");
        userChoice=sc.nextInt();
    }

    public void userChoice() {
        switch (userChoice) {
            case 1:
                result = addingNumbers();
                displayResult();
                break;
            case 2:
                result = subtractingNumbers();
                displayResult();
                break;
            case 3:
                result = multiplyingNumbers();
                displayResult();
                break;
            case 4:
                result = dividingNumbers();
                if(result!=-1)
                    displayResult();
                break;
            default:
                System.out.println("Please enter a valid choice");
                return;
        }

    }
    public int addingNumbers()
    {
        return (firstNumber+secondNumber);
    }
    public int subtractingNumbers()
    {
        return (firstNumber-secondNumber);
    }
    public int multiplyingNumbers()
    {
        return (firstNumber*secondNumber);
    }
    public int dividingNumbers()
    {

        int k=0;
        try{
            k= (firstNumber/secondNumber);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero exception");
            k=-1;
        }
        return k;

    }
    public void displayResult()
    {
            System.out.println("Result is: "+result);
    }

}