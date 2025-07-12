
package Classes;

public class UsageDetails {
    
    private int id;
    private int customer_id ;
    private String customer_nic ;
    private String month;
    private int units;
    private double total_bill;

    public UsageDetails(int id, int customer_id, String customer_nic, String month, int units, double total_bill) {
        this.id = id;
        this.customer_id = customer_id;
        this.customer_nic = customer_nic;
        this.month = month;
        this.units = units;
        this.total_bill = total_bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_nic() {
        return customer_nic;
    }

    public void setCustomer_nic(String customer_nic) {
        this.customer_nic = customer_nic;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(double total_bill) {
        this.total_bill = total_bill;
    }
    
    
    
}
