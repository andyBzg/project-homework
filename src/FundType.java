import java.util.Random;

public enum FundType {

    STATE("В государственном"),
    NON_STATE("В частном"),
    SCAMMERS("Мошенники");

    private String message;

    FundType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static FundType getRandomType() {
        FundType[] types = FundType.values();
        Random random = new Random();
        return types[random.nextInt(values().length)];
    }

}
