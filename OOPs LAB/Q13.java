//Queue
public class Q {
	int n ;
	boolean valueSet=false;
	
	synchronized int get() {
		while(valueSet==false) {
			try {
				wait();			
			}catch (InterruptedException e) {
				System.out.println("Interrupt is caught");
			}
		}
		System.out.println("Got: "+n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while(valueSet==true) {
			try {
				wait();			
			}catch (InterruptedException e) {
				System.out.println("Interrupt is caught");
			}
		}
		this.n=n;
		valueSet = true;
		System.out.println("Put: "+n);
		notify();
	}
}

// Producer
public class Producer implements Runnable {
	Q q;
	Producer(Q q){
		this.q=q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	public void run() {
		 for(int i = 1; i <= 10; i++) {
	            q.put(i);
	     }
	}
}

// Consumer
public class Consumer implements Runnable{
	Q q;
	Consumer(Q q){
		this.q=q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
            q.get();
        }
	}
}

//main
public class ProducerConsumer {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Producer Consumer");
	}

}
