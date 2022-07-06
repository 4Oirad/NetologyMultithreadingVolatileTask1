public class ThreadToy implements Runnable {

    private final static int BUTTON_ON_TIME = 1000;

    @Override
    public void run() {
        while (true) {
            if (Main.button) {
                try {
                    Thread.sleep(BUTTON_ON_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Main.button = false;
                System.out.println("Тумблер выключен");
            }
        }

    }
}