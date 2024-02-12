package gr.aueb.cf.sock;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServ extends Thread {
    ServerSocket servFd;
    final int serverPort = 13;

    @Override
    public void run() {
        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100);

            for (;;) {
                Socket connectedFd = servFd.accept();

                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write("Local Server says: " + new Date());
                bw.flush();
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
