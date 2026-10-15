import java.util.Scanner;
class Order{

    public static void main(String [] args){

// print the info

        System.out.println(" enter 1 for pepsi ");
        System.out.println(" enter 2 for mazza ");
        System.out.println(" enter 3 for sprite ");
        System.out.println(" enter 4 for fanta ");

int total =0;
        // create string array to store names

         String [] drinks= {"pepsi","mazza","sprite","fanta"};


        int [] prices = {90,30,15,40};




        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter the choice :" );

        int choice = scn.nextInt();

        while(choice!=0){




// print the bill based on the choice


            if(choice == 1)
            {      total = total +prices[choice-1];} //90

            else if(choice == 2)
            { total =total+  prices[choice-1];} //30

            else if(choice == 3)
            {total =total + prices[choice-1];}// 15

            else if(choice == 4)
            {total =total + prices[choice-1];}// 40

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

        System.out.println("pay rs : " + total );
        System.out.println("Thanks for the purchase"  );




    }


}