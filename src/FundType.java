import java.util.Random;

public enum FundType {

    STATE,
    NON_STATE,
    SCAMMERS;


    public static FundType getRandomType() {
        FundType[] types = FundType.values();
        Random random = new Random();
        return types[random.nextInt(values().length)];
    }

}
