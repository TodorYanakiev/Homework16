import java.util.Scanner;

public class Main {
    public static int textLength(){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("[ ,.,,]");
        int result = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) result--;
        }
        return result;
    }
    public static void main(String[] args) {
        //ex1
//        System.out.println(textLength());
    }
}