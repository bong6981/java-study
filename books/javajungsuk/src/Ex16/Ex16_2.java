package Ex16;
import java.net.*;

public class Ex16_2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.codechobo.com:80/sample/"
        + "hello.html?referer=codechobo#index1");

        System.out.println(url.getAuthority());
//        System.out.println(url.getContent());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getProtocol());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
        System.out.println(url.getUserInfo());
        System.out.println(url.toExternalForm());
        System.out.println(url.toURI());



    }
}
