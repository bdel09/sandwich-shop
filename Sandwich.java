import java.util.scanner;
public class Sandwich{
    public static void main(String[] args) {
        //Prompt user for Sandwich size: Regular (encode as (1)), (Large, as (2))
        Scanner size = new Scanner(System.in);
        System.out.println("Enter Size; regular for 1 and large for 2: ");
        size.nextInt();
        //Set u cnditionals
        //
        if (size.nextInt == 1){
            float price = 5.45
        }
        else if (size.nextInt == 2) {
            float price = 8.45
        }
        else {
            System.out.println("Invalid choices. Choose 1 or 2. ")
        }

        //Let user decide if sand is loaded
        boolean is_loaded;
        Scanner Status = new Scanner(System.in);
        System.out.println("Is your sandwich loaded? (Yes: True, No; False) ");
        Status.next();
        if (Status.next() == True) {
            float price += 1.00;
        }
        else if (Status.next() = False) {
            float price += 2.00;
        }


        //Read in age
        Scanner age = new Scanner(System.in);
        System.out.println("Enter age: ");
        age.NextInt();
        //More conditionals: if =< 17, 10% discount, 20 for 65+ andeksewise no discount
        if (age =< 17){
            float disc = price * 0.10;
        }
        else if (age >= 65){
            float disc = price * 0.20;
        }
        else {
            System.out.println("No discount! ");
        }
        //Display total cost
        float total = disc + price;
        System.out.println("Your total is: " + total + " .");
    }
}


