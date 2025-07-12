
package Classes;

public class CustomerDetails {
    
    private int id;
    private String name;
    private String address;
    private String nic_number;
    private String contact;

    public CustomerDetails(int id, String name, String address, String nic_number, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nic_number = nic_number;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic_number() {
        return nic_number;
    }

    public void setNic_number(String nic_number) {
        this.nic_number = nic_number;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
