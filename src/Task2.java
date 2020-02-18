import java.util.Scanner;

public class Task2 {
    public int getMax(int num1, int num2){
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
       num1 = sc.nextInt();
        System.out.println("Input next number: ");
       num2 = sc.nextInt();
        if (num1 > num2){
            max = num1;
        }
        else {
            max = num2;
        }
        return max;
    }
      public float getMax(float num1, float num2){
          float max;
          Scanner sc = new Scanner(System.in);
          System.out.println("Input first number: ");
          num1 = sc.nextFloat();
          System.out.println("Input next number: ");
          num2 = sc.nextFloat();
          if (num1 > num2){
              max = num1;
          }
          else {
              max = num2;
          }
          return max;
      }
    }

