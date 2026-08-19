

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class  Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManytoOne
    @JoinColumn(name="advisorId")
    private Advisor advisor;


    @OneToMany(mappedby="client")
    private List <Portfolio> portfolios;
    
    private Long clientid;


    @Column(nullable=false)
    private String FirstName;

    @Column(nullable=false)
    private String LastNameName;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String phone;
    
    @Column(nullable=false)
    private String email;
    
    //Constructor
    public class Client(Long clientid, String firstName,String lastName,String address,String phone,String email ){
        this.firstName=FirstName;
        this.lastName=LastNameName;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

     public Long getclientid() {
        return this.clientid;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastNameName

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getaddress() {
        return this.address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getphone() {
        return this.phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    








}
}