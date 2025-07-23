public class Printer {

    public synchronized void printDocument(String userName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(userName + " is printing " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(userName + " finished printing.\n");
    }

}
