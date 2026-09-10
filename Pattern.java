import java.util.Scanner;
public class Pattern 
{
    public static void main(String[] args) 
    {
        int rows = 10; 
        System.out.println("----------------------------");
        System.out.println("Pattern A     Pattern B");
        System.out.println("----------------------------");
        
        for (int i = 1; i <= rows; i++) 
        {
            //LOOP A
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            //SPACE
            for (int space = i; space <= rows + 4; space++) {
                System.out.print(" ");
            }

            //LOOP B
            for (int a = i; a <= rows; a++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}

