package DemoFor.PennyFlo.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "InvoiceDetails")
public class Invoice_Details {

    @Id
    private int invoiceDetailId;
    private String vendorName;
    private String VAT_Number;
    private String Reason;
    private String email;
    private String invoiceNumber;
    private String currency;
    private Date invoiceDate;
    private Date dueDate;
    private String type;
    private String totalAmount;
    private String status;
    private String notes;

    @ManyToOne
    private User userInvoiceDetail;

    @OneToOne
    private Invoice invoice;

    public int getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(int invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVAT_Number(String VAT_Number) {
        this.VAT_Number = VAT_Number;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVAT_Number() {
        return VAT_Number;
    }

    public String getReason() {
        return Reason;
    }

    public String getEmail() {
        return email;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getType() {
        return type;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }

    public User getUserInvoiceDetail() {
        return userInvoiceDetail;
    }

    public void setUserInvoiceDetail(User userInvoiceDetail) {
        this.userInvoiceDetail = userInvoiceDetail;
    }

    public Invoice_Details(int invoiceDetailId, String vendorName, String VAT_Number, String reason, String email, String invoiceNumber, String currency, Date invoiceDate, Date dueDate, String type, String totalAmount, String status, String notes, User userInvoiceDetail) {
        this.invoiceDetailId = invoiceDetailId;
        this.vendorName = vendorName;
        this.VAT_Number = VAT_Number;
        Reason = reason;
        this.email = email;
        this.invoiceNumber = invoiceNumber;
        this.currency = currency;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.type = type;
        this.totalAmount = totalAmount;
        this.status = status;
        this.notes = notes;
        this.userInvoiceDetail = userInvoiceDetail;
    }

    public Invoice_Details() {
    }

}
