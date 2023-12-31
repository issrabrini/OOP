public class LibraryCard {
    private int cardNumber;
    private boolean isActive;

    public LibraryCard(int cardNumber) {
        this.cardNumber = cardNumber;
        this.isActive = true; // Assuming the card is active by default
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivateCard() {
        isActive = false;
    }
}
