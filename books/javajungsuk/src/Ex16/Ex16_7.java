package Ex16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.stream.IntStream;

public class Ex16_7 {
    public static void main(String[] args) {
        try{
            String serverIp = "127.0.01";
            System.out.println("서버에 연결 중 서버 ip : " + serverIp);
            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터 받은 메시지 ; " + dis.readUTF());
            System.out.println("연결종료");

            dis.close();;
            socket.close();
            System.out.println("연결 종료");

        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
