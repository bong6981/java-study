package Ex16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex16_3 {
    public static void main(String[] args) {
        String address = "http://www.codechobo.com/sample/hello.html";
        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println(conn);
            System.out.println(conn.getAllowUserInteraction());
            System.out.println(conn.getConnectTimeout());
            System.out.println(conn.getContentLength());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
