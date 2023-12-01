package DemoFor.PennyFlo.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TransactionHistory_table")
public class TransactionHistory {

    @Id
    private int transactionId;
    private Date date;
    private String counterParty;
    private long refernceNo;
    private String category;
    private String bank;
    private long totalAmount;
    private long billNo;

    @ManyToOne
    private User userTransaction;
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public User getUserTransaction() {
        return userTransaction;
    }

    public void setUserTransaction(User userTransaction) {
        this.userTransaction = userTransaction;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public void setRefernceNo(long refernceNo) {
        this.refernceNo = refernceNo;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setBillNo(long billNo) {
        this.billNo = billNo;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public long getRefernceNo() {
        return refernceNo;
    }

    public String getCategory() {
        return category;
    }

    public String getBank() {
        return bank;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public long getBillNo() {
        return billNo;
    }

    public TransactionHistory(int transactionId, Date date, String counterParty, long refernceNo, String category, String bank, long totalAmount, long billNo, User userTransaction) {
        this.transactionId = transactionId;
        this.date = date;
        this.counterParty = counterParty;
        this.refernceNo = refernceNo;
        this.category = category;
        this.bank = bank;
        this.totalAmount = totalAmount;
        this.billNo = billNo;
        this.userTransaction = userTransaction;
    }

    public TransactionHistory() {
    }

}