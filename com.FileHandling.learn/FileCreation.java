import java.io.File;

public class FileCreation {
    public static void main(String[]args){
        File file1 = new File("pw.text");
        System.out.println(file1.exists());
        try{
            file1.createNewFile();
        }catch(Exception chException){
            System.out.println("File Not created");
        }
        if (file1.exists()) {
            System.out.println("File is Create Successfull" + " " +  file1);
        }else {
            System.out.println("File Not create");
        }
        System.out.println(file1.exists());

        File dir = new File("Ashish");
        try{
            dir.mkdir();
        }catch(Exception chException){
            System.out.println("Folder is Not created");
        }
        System.out.println(dir.exists());
        File file2 = new File(dir,"Ashish.txt");
        try {
            file2.createNewFile();
        } catch (Exception e) {
            System.out.println("File not created" + e);
        }
        System.out.println(file2.exists());
        int count = 0;
        File file3 = new File("Naresh_IT");
        String number []=file3.list();
        for(String name:number){
            count++;
            System.out.println(name);
        }
        System.out.println("Number all file and Dir in JAvaCore: " + count);
    } 
}
