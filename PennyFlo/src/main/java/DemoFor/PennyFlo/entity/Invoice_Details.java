package DemoFor.PennyFlo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "InvoiceDetails")
public class Invoice_Details {

    @Id
    private int invoiceDetailId;
    private String vendorName;
    private String vatNumber;
    private String reason;
    private String email;
    private String invoiceNumber;
    private String currency;
    private String invoiceDate;
    private String dueDate;
    private String type;
    private String totalAmount;
    private String status;
    private String notes;

    @JsonIgnore
    @ManyToOne
    private User userInvoiceDetail;

    @JsonIgnore
    @OneToOne(mappedBy = "invoiceDetails",cascade = CascadeType.ALL)
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

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setDueDate(String dueDate) {
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

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getReason() {
        return reason;
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

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getDueDate() {
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

    public Invoice getInvoice() {
        return invoice;
    }

    public Invoice_Details(int invoiceDetailId, String vendorName, String vatNumber, String reason, String email, String invoiceNumber, String currency, String invoiceDate, String dueDate, String type, String totalAmount, String status, String notes, User userInvoiceDetail, Invoice invoice) {
        this.invoiceDetailId = invoiceDetailId;
        this.vendorName = vendorName;
        this.vatNumber = vatNumber;
        this.reason = reason;
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
        this.invoice = invoice;
    }

    public Invoice_Details() {
    }

}
