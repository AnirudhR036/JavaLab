public class ThreadExample {

     static class BMSDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("BMS College of Engineering");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    static class CSEDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("CSE");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two threads
        Thread bmsThread = new BMSDisplayThread();
        Thread cseThread = new CSEDisplayThread();

        bmsThread.start();
        cseThread.start();
    }
}
