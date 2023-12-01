package DemoFor.PennyFlo.entity;
import jakarta.persistence.*;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="User_Table")
public class User {

    @Id
    private int employeeId;
    @Column(unique = true)
    private String userName;
    private String password;
    private String role;
    private String mobileNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<BankDetails> bankDetails;

    @JsonIgnore
    @OneToMany(mappedBy = "userInvoice")
    private List<Invoice> invoice;

    @JsonIgnore
    @OneToMany(mappedBy = "userInvoiceDetail")
    private List<Invoice_Details> invoiceDetails;

    @JsonIgnore
    @OneToMany(mappedBy = "userTransaction")
    private List<TransactionHistory> transactionHistories;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public List<BankDetails> getBankDetails() {
        return bankDetails;
    }

    public List<Invoice> getInvoice() {
        return invoice;
    }

    public List<Invoice_Details> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setBankDetails(List<BankDetails> bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void setInvoice(List<Invoice> invoice) {
        this.invoice = invoice;
    }

    public void setInvoiceDetails(List<Invoice_Details> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public void setTransactionHistories(List<TransactionHistory> transactionHistories) {
        this.transactionHistories = transactionHistories;
    }

    public List<TransactionHistory> getTransactionHistories() {
        return transactionHistories;
    }

    public User(int employeeId, String userName, String password, String role, String mobileNumber, List<BankDetails> bankDetails, List<Invoice> invoice, List<Invoice_Details> invoiceDetails, List<TransactionHistory> transactionHistories) {
        this.employeeId = employeeId;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.mobileNumber = mobileNumber;
        this.bankDetails = bankDetails;
        this.invoice = invoice;
        this.invoiceDetails = invoiceDetails;
        this.transactionHistories = transactionHistories;
    }

    public User() {
    }

}
