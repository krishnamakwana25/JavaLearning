package org.example.designpatterns.solid.dip;

public class ShoppingMall {

    private BankCard bankCard;

    ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }
    public void doPurchase(long amount){
        bankCard.doTransaction(amount);
    }
//    private CreditCard creditCard;
//
//    ShoppingMall(CreditCard creditCard){
//        this.creditCard = creditCard;
//    }
//    public void doPurchase(long amount){
//        creditCard.doTransaction(amount);
//    }
//    private DebitCard debitCard;
//    ShoppingMall(DebitCard debitCard){
//        this.debitCard = debitCard;
//    }
//    public void doPurchase(long amount){
//        debitCard.doTransaction(amount);
//    }

    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();
        CreditCard creditCard1 = new CreditCard();

//        BankCard bankCard1 = new DebitCard(); // runtime polymorphism
        BankCard bankCard1 = new CreditCard();  // runtime polymorphism
        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchase(10000);
    }
}
