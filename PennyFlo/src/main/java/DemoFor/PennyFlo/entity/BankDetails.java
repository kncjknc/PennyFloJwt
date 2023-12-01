package DemoFor.PennyFlo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bank_Table")
public class BankDetails {

    @Id
    private int userId;
    private String bankName;
    private String accountNumber;
    private String accountHolderNumber;
    private String bankIFSC;
    private String currency;

    @ManyToOne
    private User user;

    public int getUerId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public String getCurrency() {
        return currency;
    }

    public BankDetails() {
    }


    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }

    public BankDetails(int userId, String bankName, String accountNumber, String accountHolderNumber, String bankIFSC, String currency, User user) {
        this.userId = userId;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountHolderNumber = accountHolderNumber;
        this.bankIFSC = bankIFSC;
        this.currency = currency;
        this.user = user;
    }
}