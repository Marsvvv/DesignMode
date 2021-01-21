package StrategyMode;

/**
 * StrategyMode策略模式：整体的替换算法
 * 利用Java的接口机制，实现此功能
 */
public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Taro", new WinningStrategy(100));
        Player p2 = new Player("Hana", new ProbStrategy(200));
        for (int i = 0; i < 10000; i++) {
            Hand h1 = p1.nextHand();
            Hand h2 = p2.nextHand();
            if (h1.isStrongThan(h2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if (h1.isWeakThan(h2)) {
                System.out.println("Winner:" + p2);
                p2.win();
                p1.lose();
            } else {
                System.out.println("Even...");
                p2.even();
                p1.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
