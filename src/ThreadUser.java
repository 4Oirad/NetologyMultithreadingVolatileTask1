public class ThreadUser implements Runnable {

    private final static int BUTTON_OFF_TIME = 2000;
    private final static int NUMBER_OF_ITERATIONS = 4;
    private int n = 0;
    @Override

    public void run() {

        while (true) {
            try {
                if (!Main.button) {
                    Thread.sleep(BUTTON_OFF_TIME);
                    Main.button = true;
                    n++;
                    System.out.println(Thread.currentThread().getName() + " включил тумблер");
                    if (n == NUMBER_OF_ITERATIONS) break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}