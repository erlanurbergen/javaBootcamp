package shopProject;

public class Buyer extends User{
    private CreditCardType card;
    private String cardNumber;
    private double moneyCount;

    public Buyer(CreditCardType card, String cardNumber, double moneyCount) {
        this.card = card;
        if (cardNumber.length() == 16)
            this.cardNumber = cardNumber;
        else
            System.out.println("Card number incorrect");
        this.moneyCount = moneyCount;
    }

    public Buyer(String FIO, long IIN, String phoneNumber, CreditCardType card, String cardNumber, double moneyCount) {
        super(FIO, IIN, phoneNumber);
        this.card = card;
        if (cardNumber.length() == 16)
            this.cardNumber = cardNumber;
        else
            System.out.println("Card number incorrect");
        this.moneyCount = moneyCount;
    }

    public CreditCardType getCard() {
        return card;
    }

    public void setCard(CreditCardType card) {
        this.card = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(double moneyCount) {
        this.moneyCount = moneyCount;
    }

    @Override
    void changeNumber(String number) {
        setPhoneNumber(number);
    }

    @Override
    void changeFIO(String data) {
        setFIO(data);
    }
}
