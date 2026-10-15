import java.util.Scanner;
class Order{

    public static void main(String [] args){

// print the info

        System.out.println(" enter 1 for pepsi ");
        System.out.println(" enter 2 for mazza ");
        System.out.println(" enter 3 for sprite ");
        System.out.println(" enter 4 for fanta ");

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter the choice :" );

        int choice = scn.nextInt();

        while(choice!=0){




// print the bill based on the choice


            if(choice == 1)
            {System.out.println("pepsi -pay 20 rs " );}

            else if(choice == 2)
            {System.out.println(" mazza -pay 30 rs " );}

            else if(choice == 3)
            {System.out.println(" sprite -pay 15 rs " );}

            else if(choice == 4)
            {System.out.println(" fanta - pay 40 rs " );}

            else
            {System.out.println(" enter 1 to 4 only");}

// show the menu again

            System.out.println(" enter 1 for pepsi ");
            System.out.println(" enter 2 for mazza ");
            System.out.println(" enter 3 for sprite ");
            System.out.println(" enter 4 for fanta ");

//and ask the choice

            System.out.println(" Enter the choice :" );

            choice = scn.nextInt();




        }

        System.out.println("Thanks for the purchase"  );




    }


}