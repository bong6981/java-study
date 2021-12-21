package Ex8;

import java.io.*;




public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File f = createFile("test2.txt");
            System.out.println(f.getName() + "파일생성 성공");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시입력");
        }
    }

    static File createFile(String fileName) throws Exception{
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이름없");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
