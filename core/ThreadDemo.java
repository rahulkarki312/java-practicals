// Thread A that prints even numbers from 50 to 100
class ThreadA implements Runnable {
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print("Even: " + i + " ");
            }
        }
    }
}

// Thread B that prints odd numbers from 100 to 200
class ThreadB implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print("Odd: " + i + " ");
            }
        }
    }
}

// Main class to execute threads
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        // Creating threads from Runnable implementations
        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        // Starting both threads
        t1.start();
        t2.start();
    }
}
