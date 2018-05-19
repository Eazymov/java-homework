/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author user
 */
import java.io.*;

class StoreViaThread extends Thread {

    private PipedReader pipedReader;

    StoreViaThread(PipedWriter pipedWriter) {
        try {
            pipedReader = new PipedReader(pipedWriter);
        } catch (IOException ex) {
            System.err.println("From Target(): " + ex);
        }
    }

    PipedReader getStream() {
        return pipedReader;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Reading: " + pipedReader.read());
            } catch (IOException ex) {
                System.out.println("The job’s finished");
                System.exit(0);
            }
        }
    }
}

class Source extends Thread {

    final private PipedWriter pipedWriter;

    Source() {
        pipedWriter = new PipedWriter();
    }

    PipedWriter getStream() {
        return pipedWriter;
    }

    @Override
    public void run() {
        for (int idx = 0; idx < 4; idx++) {
            try {
                pipedWriter.write(idx);
                System.out.println("Writing: " + idx);
            } catch (Exception ex) {
                System.err.println("From Source.run(): " + ex);
            }
        }
    }
}

class Piped_v2 {

    public static void main(String[] args) {
        Source src = new Source();
        StoreViaThread target = new StoreViaThread(src.getStream());
        src.start();
        target.start();
    }
}
