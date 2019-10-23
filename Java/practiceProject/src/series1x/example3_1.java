package series1x;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class example3_1 {

    static Scanner sc = new Scanner(System.in);
    static File txtFile;
    static FileWriter fileWriter;

    static String fileName = "", filePath = "", content = "";
    static String save = "@Save@";

    static void setFileInfo(){
        System.out.print("Enter file name: ");
        fileName = sc.nextLine();
        System.out.print("Enter file path: ");
        filePath = sc.nextLine();
        System.out.println("Enter the content: ");
        content = sc.nextLine();
    }

    static void createFile() throws IOException{
        txtFile = new File(filePath + fileName);
        fileWriter = new FileWriter(txtFile, true);
    }

    static void writeFile(String content) throws IOException{
        BufferedWriter bufferFileWriter  = new BufferedWriter(fileWriter);
        fileWriter.append(content);

        bufferFileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        setFileInfo();
        createFile();
        writeFile(content);
        System.out.println("*\tAppending content into File has been completed");
    }

}
