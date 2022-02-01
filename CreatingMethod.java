import java.util.Scanner;

public class CreatingMethod {
    static int creatingMethod(int n,int control,boolean isReturn) {
        System.out.print(n + " ");
        if (n > 0 && isReturn == true) {
            return creatingMethod(n - 5,control,isReturn);
        } else {
            isReturn = false;
            if (control != n) {
                return creatingMethod(n + 5,control,isReturn);
            } else return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        creatingMethod(n,n,true);


    }
}
