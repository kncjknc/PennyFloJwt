package DemoFor.PennyFlo.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Invoice_Table")
public class Invoice {

    @Id
    private int invoiceId;
    private Date issueDate;
    private Date dueDate;
    private String vendorName;
    private String CIN_Number;
    private String VAT_Number;
    private String reason;
    private String type;
    private String amount;

    @ManyToOne
    private User userInvoice;

    @OneToOne
    private Invoice_Details invoiceDetails;

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setCIN_Number(String CIN_Number) {
        this.CIN_Number = CIN_Number;
    }

    public void setVAT_Number(String VAT_Number) {
        this.VAT_Number = VAT_Number;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getCIN_Number() {
        return CIN_Number;
    }

    public String getVAT_Number() {
        return VAT_Number;
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

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setUserInvoice(User userInvoice) {
        this.userInvoice = userInvoice;
    }

    public Invoice(int invoiceId, Date issueDate, Date dueDate, String vendorName, String CIN_Number, String VAT_Number, String reason, String type, String amount, User userInvoice) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.vendorName = vendorName;
        this.CIN_Number = CIN_Number;
        this.VAT_Number = VAT_Number;
        this.reason = reason;
        this.type = type;
        this.amount = amount;
        this.userInvoice = userInvoice;
    }

    public Invoice() {
    }

}
