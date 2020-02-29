import java.util.Scanner;
public class Task56 {
    void task1Rec(){
               Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        for (int i=0; i<x; i++);
        task1Rec();
                     }
}
