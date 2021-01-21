package StrategyMode;

public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int lostCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        lostCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    public Player(String name, Strategy strategy, int winCount, int lostCount, int gameCount) {
        this.name = name;
        this.strategy = strategy;
        this.winCount = winCount;
        this.lostCount = lostCount;
        this.gameCount = gameCount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", winCount=" + winCount +
                ", lostCount=" + lostCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
