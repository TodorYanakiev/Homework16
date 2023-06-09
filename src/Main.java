import java.io.File;
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
        sc.close();
        return result;
    }
    public static int readTxtAndWriteWordsCount(){
        StringBuilder builder = new StringBuilder();
        try{
            File file = new File("Iran.txt");
            Scanner fileReader = new Scanner(file,"utf-8");
            while(fileReader.hasNextLine()){
                builder.append(fileReader.nextLine());
            }
            fileReader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        String[] words = (builder.toString()).split("[ ,.,,]");
        int result = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) result--;
        }
        return result;
    }
    public static void main(String[] args) {
        //ex1
//        System.out.println("Enter text:");
//        System.out.println(textLength());
//        System.out.println(readTxtAndWriteWordsCount());//b
    }
}