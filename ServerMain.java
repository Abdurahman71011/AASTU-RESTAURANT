public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        Server server = new Server(port);// is to set server port
        server.start();// is to start thread
    }
}
