package edu.desu.partB.demos;

import java.io.File;
import java.io.IOException;

public class CheckedException {

    public static boolean CheckFile(String filename) throws IOException {
        File testFile = new File(filename);

        boolean res = testFile.createNewFile();
        return res;

    }

    public static void main(String args[]) {

        try {
            if(CheckFile("testFile.txt"))
            {
                System.out.println("File exists:");
            }

            else
            {
                System.out.println("File does not exist");
            }
        } catch (IOException ex) {
            String errMsg = ex.getMessage();
            System.out.println(errMsg);
        }
    }
}
