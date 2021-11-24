import java.lang.Thread;
public class Main {
    public static void main(String[] args)throws InterruptedException {
    Cronometro c1 = new Cronometro();
    for (int i = 0; i < 360; i++) {
        c1.timeTick();
        System.out.println(c1.getTime());
        Thread.sleep(1000);
    }
    }
}
