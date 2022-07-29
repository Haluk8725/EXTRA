package fileCreation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice2_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer= new FileWriter("First.txt");
     //   File file = new File("First.doc");
        writer.write(" Korkma sönmez bu şafaklarda\n Sönmeden üstimde tüten en so ocak\n o benim milletimişndidr ancak\n O benim milletimindir ancak");
       writer.append(" M. Akif Ersoy");
     //   System.out.println("Do you want to delete doc file");
        Scanner in= new Scanner(System.in);
        String ans=in.next();
        //if(ans.equals("yes"))
     //   file.delete();
        writer.close();


    }
}
