package fileCreation;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("3A-[AudioTrimmer.com].wav");
        AudioInputStream list = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(list);

        Scanner in = new Scanner(System.in);

        String respond = "";
        while (!respond.equalsIgnoreCase("q")) {
            System.out.println("P = play , S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice:");
            respond = in.next();
            respond = respond.toUpperCase();
            switch (respond) {
                case "P": {
                    clip.start();
                    break;}
                case "S":{
                    clip.stop();
                    break;
                }
                case "R": {
                    clip.setMicrosecondPosition(0);
                    break;
                }
                case "Q":{
                    clip.close();
                    break;
                }
                default: System.out.println("Not valid respons");
            }

        }
        System.out.println("Bye bye");
    }
}