import java.time.LocalDate;

class LibraryCard {
    String cardNumber;
    boolean isActive;
    LocalDate expirationDate;

    public LibraryCard() {
        this.cardNumber = String.valueOf((int) (Math.random() * 1000000000));
        this.isActive = true;
        this.expirationDate = LocalDate.now().plusYears(1);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
