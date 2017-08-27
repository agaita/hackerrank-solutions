package hackerrank.distributedsystems;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by agaita on 8/26/17.
 */
public class UDSEchoServer {
    public static void main(String[] args) {
        try {
            final ServerSocket server = new ServerSocket(50050);
            while (true) {
                final Socket client = server.accept();
                final EchoHandler handler = new EchoHandler(client);
                final Thread thread = new Thread(handler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class EchoHandler implements Runnable {
        private static final String END_MESSAGE = "END";
        private final Socket client;

        private EchoHandler(Socket client) {
            this.client = client;
        }

        public void run() {
            try {
                final BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                final PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
                handleMessage(reader, writer);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeSocket();
            }
        }

        private void closeSocket() {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void handleMessage(BufferedReader reader, PrintWriter writer) throws IOException {
            while (true) {
                final String line = reader.readLine();
                if (END_MESSAGE.equals(line)) break;
                else writer.println(line);
            }
        }
    }
}
