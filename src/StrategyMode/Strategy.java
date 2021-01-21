package StrategyMode;

public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}
