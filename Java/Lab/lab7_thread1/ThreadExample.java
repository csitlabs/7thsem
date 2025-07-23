public class ThreadExample {

    static class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(getName() + ": " + i);
            }
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("ExtendedThread");

        Thread thread2 = new Thread(new MyRunnable(), "RunnableThread");

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");

        thread1.start();
        thread2.start();
    }
}
