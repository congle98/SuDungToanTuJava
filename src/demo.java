import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = s.nextFloat();
        System.out.println("Enter height: ");
        height = s.nextFloat();
        float area = width * height;
        System.out.println("Area is: "+area);
    }
}
