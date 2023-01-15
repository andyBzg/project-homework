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

}
