import java.io.File;
import java.io.FileWriter;

public class UseOfWritter {
    public static void main(String[]args){
        File dir = new File("Ashish");
        File file = new File(dir,"Example.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file,true);
            fw.write("Nhi");
            fw.write("\n");
            fw.write(65);
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            fw.write("Hello Boss");
            fw.close();
            System.out.println("File Written successful");
        } catch (Exception e) {
            System.out.println("Sorry Error occered in writting in file+ " + e);
        }
    }
}
