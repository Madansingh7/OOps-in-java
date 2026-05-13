class SharedResource {
     String message;
     boolean isMessageAvailable = false;

    // Method for client to send message
    public synchronized void sendMessage(String msg) {
        while (isMessageAvailable==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message = msg;
        System.out.println("Client: Sent message -> " + msg);
        isMessageAvailable = true;
        notify();
    }

    // Method for server to receive message
    public synchronized String receiveMessage() {
        while (isMessageAvailable==false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String received = message;
        System.out.println("Server: Received message -> " + received);
        isMessageAvailable = false;
        notify();
        return received;
    }

    // Method for server to send acknowledgment
    public synchronized void sendAcknowledgement() {
        System.out.println("Server: Sending acknowledgement -> Message Received");
    }
}

// Client Thread
class Client extends Thread {
    private SharedResource resource;

    public Client(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.sendMessage("Hello Server!");
    }
}

// Server Thread
class Server extends Thread {
    private SharedResource resource;

    public Server(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        String msg = resource.receiveMessage();
        resource.sendAcknowledgement();
    }
}

// Main Class
public class ClientServerSimulation {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Client client = new Client(resource);
        Server server = new Server(resource);

        server.start();  // Start server first (waiting state)
        client.start();  // Then client sends message
    }
}
