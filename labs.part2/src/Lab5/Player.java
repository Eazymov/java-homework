/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.File;
import java.io.PipedReader;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author user
 */
class Player extends Thread {

    private String src;
    private PipedReader pipedReader;
    private SourceDataLine audioLine = null;
    private AudioInputStream audioInputStream = null;

    Player(String src) {
        this.src = src;
    }

    public void play() {

        byte[] b = new byte[2048];
        
        try {
            File file = new File("scom.au");
            audioInputStream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            if (!AudioSystem.isLineSupported(info)) {
                System.err.println("Линия не поддерживается");
                System.exit(0);
            }

            audioLine = (SourceDataLine) AudioSystem.getLine(info);

            audioLine.open(format);
            audioLine.start();

            int num = 0;

            while ((num = audioInputStream.read(b)) != -1) {
                audioLine.write(b, 0, num);
            }

            audioLine.drain();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void exit() {
        try {
            audioInputStream.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        audioLine.stop();
        audioLine.close();

        System.exit(0);
    }

    PipedReader getStream() {
        return pipedReader;
    }

    public void run() {
        play();
    }
}
