package src;

import java.io.*;


public class WriterAndReader {

    public void write(String filePath,String s){
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("we are overwriting the file " + filePath);
        }else{
            System.out.println("we are creating a new file " + filePath);
        }
        try (
            FileWriter writer = new FileWriter(file);
            PrintWriter pw = new PrintWriter(writer);
        ) {
            pw.write(s);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void read(String filePath){
        File file = new File(filePath);
        try (

                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);

        ){ while(br.ready()){
            String s = br.readLine();
            System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
