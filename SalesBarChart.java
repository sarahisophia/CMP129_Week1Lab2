import java.util.Scanner;
public class SalesBarChart
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int stores = 5;
        int[] salesData = new int[stores]; 
        int j = 0;
        while (j < stores) 
        {
            System.out.print("Enter today's sale for store " + (j + 1) + ": ");
            salesData[j] = keyboard.nextInt();
            j++;
        }
        
        System.out.println("\nSALES BAR CHART:");
        System.out.println("Each * = $100");
        
        for (int i = 0; i < stores; i++) 
        {
            System.out.print("Store " + (i + 1) + ": ");
            int asterisks = salesData[i]/100;
            for (int k = 0; k < asterisks; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

