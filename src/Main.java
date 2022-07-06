public class Main {

    public static volatile boolean button = false;

    public static void main(String[] args) throws InterruptedException {
        Thread user = new Thread(new ThreadUser(), "Пользователь");
        Thread toy = new Thread(new ThreadToy());
        toy.setDaemon(true);
        user.start();
        toy.start();
    }
}