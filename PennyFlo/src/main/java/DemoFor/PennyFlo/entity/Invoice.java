package DemoFor.PennyFlo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Invoice_Table")
public class Invoice {

    @Id
    private int invoiceId;
    private String issueDate;
    private String dueDate;
    private String vendorName;
    private String cinNumber;
    private String vatNumber;
    private String reason;
    private String type;
    private String amount;

    @JsonIgnore
    @ManyToOne
    private User userInvoice;

    @JsonIgnore
    @OneToOne
    private Invoice_Details invoiceDetails;

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public void setCinNumber(String cinNumber) {
        this.cinNumber = cinNumber;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public void setInvoiceDetails(Invoice_Details invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getVendorName() {
        return vendorName;
    }


    public String getCinNumber() {
        return cinNumber;
    }

    public String getReason() {
        return reason;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {
        return amount;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public User getUserInvoice() {
        return userInvoice;
    }

    public Invoice_Details getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setUserInvoice(User userInvoice) {
        this.userInvoice = userInvoice;
    }

    public Invoice(int invoiceId, String issueDate, String dueDate, String vendorName, String cinNumber, String vatNumber, String reason, String type, String amount, User userInvoice, Invoice_Details invoiceDetails) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.vendorName = vendorName;
        this.cinNumber = cinNumber;
        this.vatNumber = vatNumber;
        this.reason = reason;
        this.type = type;
        this.amount = amount;
        this.userInvoice = userInvoice;
        this.invoiceDetails = invoiceDetails;
    }

    public Invoice() {
    }

}
