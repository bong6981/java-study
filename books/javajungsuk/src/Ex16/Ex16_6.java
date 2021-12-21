package Ex16;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16_6 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "서버준비");

        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true){
            System.out.println(getTime()+"연결요청 기다림 ");
            Socket socket = serverSocket.accept();
            System.out.println(getTime()+socket.getInetAddress() + "로부터 연결 요청이 왔다");

            OutputStream out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);

            dos.writeUTF("[Notice] Test MESSAGE1 from Server");
            System.out.println(getTime()+"데이터 전송 완료");

            dos.close();
            socket.close();
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
