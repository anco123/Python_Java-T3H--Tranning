/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series1x;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LAVENDER
 */
public class example3_2 {
    static Scanner sc = new Scanner(System.in);
    static String fileName, filePath, content;
    static File fileInput;
    static FileInputStream readFileInput;
    static boolean fileIsExist = true;

    static void setFileInfo(){
        System.out.print("Enter file name: ");
        fileName = sc.nextLine();
        System.out.print("Enter file path: ");
        filePath = sc.nextLine();
    }

    static void fileIsExist(String fileName, String filePath){
        fileInput = new File(filePath + fileName);
        try {
            readFileInput = new FileInputStream(fileInput);
        } catch (FileNotFoundException ex) {
            fileIsExist = false;
            //Logger.getLogger(Example3_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static String getFileContent(FileInputStream reader) throws IOException{
        if(fileIsExist){
            StringBuilder result = new StringBuilder();
            int count;

            while ((count = reader.read()) != -1) {
                result.append((char)count);
            }
            reader.close();
            content = result.toString();
            return content;
        }

        return String.format("File ( %s ) doesn't exist", (filePath + fileName));
    }

    public static void main(String[] args) throws IOException {
        setFileInfo();
        fileIsExist(fileName, filePath);
        System.out.println(getFileContent(readFileInput));
    }
}
