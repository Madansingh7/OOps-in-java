class Signal {

    String currentLight = "RED";
}

// Red Light Thread
class RedLight extends Thread {

    Signal s;

    RedLight(Signal s) {
        this.s = s;
    }

    public void run() {

        synchronized(s) {

            try {

                while(!s.currentLight.equals("RED")) {
                    s.wait();
                }

                System.out.println("RED Light ON");
                Thread.sleep(5000);

                System.out.println("RED Light OFF");

                s.currentLight = "YELLOW";

                s.notifyAll();

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Yellow Light Thread
class YellowLight extends Thread {

    Signal s;

    YellowLight(Signal s) {
        this.s = s;
    }

    public void run() {

        synchronized(s) {

            try {

                while(!s.currentLight.equals("YELLOW")) {
                    s.wait();
                }

                System.out.println("YELLOW Light ON");
                Thread.sleep(2000);

                System.out.println("YELLOW Light OFF");

                s.currentLight = "GREEN";

                s.notifyAll();

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Green Light Thread
class GreenLight extends Thread {

    Signal s;

    GreenLight(Signal s) {
        this.s = s;
    }

    public void run() {

        synchronized(s) {

            try {

                while(!s.currentLight.equals("GREEN")) {
                    s.wait();
                }

                System.out.println("GREEN Light ON");
                Thread.sleep(5000);

                System.out.println("GREEN Light OFF");

                s.notifyAll();

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Controller Class
public class Main {

    public static void main(String[] args) {

        Signal s = new Signal();

        RedLight r = new RedLight(s);
        YellowLight y = new YellowLight(s);
        GreenLight g = new GreenLight(s);

        r.start();
        y.start();
        g.start();

        // Checking thread status using isAlive()

        while(r.isAlive()) {
            System.out.println("Red thread is running...");
            break;
        }

        while(y.isAlive()) {
            System.out.println("Yellow thread is running...");
            break;
        }

        while(g.isAlive()) {
            System.out.println("Green thread is running...");
            break;
        }
    }
}
