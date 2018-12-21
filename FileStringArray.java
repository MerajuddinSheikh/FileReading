package ArrayStringFileRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStringArray {
    public static void main(String[] args) throws Exception{

        String name= "name is  : ";
        String name1=" line is : ";
        String FileContents = getFileContents("F:\\bookList.txt");
        // by array string  reading file line by line with split("\n") and prints the line only.
        String[] Details=FileContents.split("\n");
        System.out.println(name + Details[3]);
        System.out.println(name1 + Details[5]);

        //file reading word by word by split("!") prints the all contents of file
        String[] Words= FileContents.split("!");
        System.out.println(Words[0]);
        // file reading word by word by split(",") and prints the word separated by coma.
        String[] charector=FileContents.split(",");
        System.out.println(charector[1]);
        System.out.println(charector[2]);
        System.out.println(charector[3]);
        System.out.println(charector[4]);
        System.out.println(charector[16]);
               WritingFile(charector[2] + charector[7] +charector[8],"F:\\newfile1.txt" );

    }


    public static String getFileContents(String path) throws Exception {


        String lines = " ";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {

            lines += line + " \n";

            line = br.readLine();
        }
        fr.close();
        br.close();
        return lines;
    }

    public static  void WritingFile(String data, String path1)throws Exception{

        FileWriter fw = new FileWriter(path1,true);
        BufferedWriter bw = new BufferedWriter(fw);
         bw.write(data);
         bw.close();
         fw.close();


    }
}



