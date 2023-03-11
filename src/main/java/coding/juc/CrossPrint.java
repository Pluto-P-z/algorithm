package coding.juc;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.cross")
public class CrossPrint {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            log.debug("t1");
        }, "t1");

        Thread t2 = new Thread(() -> {
            log.debug("t2");
        }, "t2");

        for (int i = 0; i < 10; i++) {
            t1.start();
            t2.start();
        }
    }
}
