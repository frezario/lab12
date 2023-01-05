package Task1;

import java.util.Arrays;

public class Chain {
    static int[] denominators;
    static int amount;

    public Chain() {

    }

    public Chain(int[] den, int a) {
        denominators = den;
        amount = a;
    }

    public int transmit(int required, int got) {
        if (got == required) {
            return amount;
        }
        if (got > required) {
            return amount - 1;
        }

        int coin_idx = Arrays.binarySearch(denominators, required - got);

        if (coin_idx == -1) {
            coin_idx = 0;
        }

        if (coin_idx == -denominators.length - 1) {
            coin_idx = denominators.length - 1;
        }

        Chain chain = new Chain();
        amount++;
        return chain.transmit(required, got + denominators[coin_idx]);
    }
}
