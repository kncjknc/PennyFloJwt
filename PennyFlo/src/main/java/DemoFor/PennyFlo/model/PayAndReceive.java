package DemoFor.PennyFlo.model;

public class PayAndReceive {

    private String payable;
    private String receivable;

    public String getPayable() {
        return payable;
    }

    public String getReceivable() {
        return receivable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public void setReceivable(String receivable) {
        this.receivable = receivable;
    }

    public PayAndReceive(String payable, String receivable) {
        this.payable = payable;
        this.receivable = receivable;
    }

    public PayAndReceive() {
    }
}
