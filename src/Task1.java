import java.util.Scanner;
public class Task1 {// Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов

    public void drawRectangle(int width, int height){
        System.out.print("Input height: ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();// высота прямоугольника в символах
        System.out.print("Input width: ");// ширина прямоугольника в символах
        width = in.nextInt();
        System.out.println("Your rectangle is: ");
        for (int i = 0; i < height; i++){
            for (int a = 0;a < width; a++)
            {
                System.out.print('+'+ " ");
            }
            System.out.println("\r");
        }

    }

    public void drawRectangle(int side){//перезаписываем функцию
        System.out.println();
        System.out.print("Input side:");//сторона квадрата в символах
     Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        for (int n = 0; n < side; n++){
            for (int k = 0; k < side; k++){
                System.out.print('+' + " ");
            }
            System.out.println("");
        }
    }
}
