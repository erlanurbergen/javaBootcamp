package shopProject;

public abstract class User {
    private String FIO;
    private long IIN;
    private String phoneNumber;

    abstract void changeNumber(String number);
    abstract void changeFIO(String data);

    public User() {

    }

    public User(String FIO, long IIN, String phoneNumber) {
        this.FIO = FIO;
        this.IIN = IIN;
        this.phoneNumber = phoneNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public long getIIN() {
        return IIN;
    }

    public void setIIN(long IIN) {
        this.IIN = IIN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", IIN=" + IIN +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
