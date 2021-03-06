package interfaces.impl;
import interfaces.Calculator;
import entities.cashnote.CashNote;
import entities.cashnote.CashNoteBundle;
import entities.request.PurchaseRequest;

public class CalculatorImpl implements Calculator {
    @Override
    public int calculateTotalPayment(PurchaseRequest request) {
        return request.getQuantity() * request.getProduct().getPrice();
    }

    @Override
    public int calculateTotalMoneyInput(CashNoteBundle bundle) {
        return bundle.getNumOfTenNotes() * CashNote.TEN.getValue()
                + bundle.getNumOfTwentyNotes() * CashNote.TWENTY.getValue()
                + bundle.getNumOfFiftyNotes() * CashNote.FIFTY.getValue()
                + bundle.getNumOfOneHundredNotes() * CashNote.ONE_HUNDRED.getValue()
                + bundle.getNumOfTwoHundredNotes() * CashNote.TWO_HUNDRED.getValue();
    }

}
