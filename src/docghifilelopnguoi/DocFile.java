package docghifilelopnguoi;

import java.io.*;
import java.util.ArrayList;

public class DocFile {
    static ArrayList<Nguoi> arr = new ArrayList<>();
    static File name = new File("Nguoi");
    static File nguoi = new File("Nguoi/newfile.txt");

    public static void main(String[] args) {
        if (!name.exists()) {
            name.mkdir();
        }
        if (!nguoi.exists()) {
            try {
                nguoi.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
//            arr.add(new Nguoi("Dung", 30, "nam", "083456834"));
//            ghiFile();
            docFile();
            for(Nguoi nguoi : arr){
                System.out.println(nguoi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ghiFile() throws IOException {
        FileWriter fileWriter = new FileWriter(nguoi, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Nguoi nguoi : arr) {
            bufferedWriter.write(nguoi.ghi());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static void docFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(nguoi);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 4)
                    arr.add(new Nguoi(str[0], Integer.parseInt(str[1].trim()), str[2], str[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }
}
