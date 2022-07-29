package fileCreation;

import java.io.File;

public class Practice1 {
    public static void main(String[] args) {
        File file = new File("SecretMessage.txt");

        if(file.exists()){
            System.out.println("That file exist");
            System.out.println(file.getAbsolutePath());
            file.delete();
            System.out.println("File deleted");
        }
        else  System.out.println("That file not exist");
    }
}
