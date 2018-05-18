package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String address;
    private int phone;


    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Customer(){}



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name ;
    }



    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return String.format("Customer [id=%s, name=%s , email=%s , address =%s , phone =%s ]", id, name, email, address,phone);
    }
}
