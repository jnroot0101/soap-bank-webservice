package server;

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class WsServer {
    public static void main(String[] args) {
        var url = "http://0.0.0.0:6655/";

        Endpoint.publish(url, new BankService());
        System.out.println("Server is running at " + url);
    }
}
