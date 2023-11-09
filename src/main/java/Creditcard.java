public abstract class  Creditcard {
    private int debt;

    public Creditcard(int debt) {
        this.debt = debt;
    }

    void pay(int amount) {
        this.debt = this.debt + amount;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

}
