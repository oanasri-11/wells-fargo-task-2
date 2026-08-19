

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class  Portfolio{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManytoOne
    @JoinColumn(name="clientid")
    private Client client;
    @OneToMany(mappedby="Portfolio")
    private List <Security> securities;


    private Long portfolioid;

    @Column(nullable=false)
    private String creationdate;

   
    //Constructor
    public class Portfolio(Long portfolioidid, String creationdate ){
        this.creationdate=creationdate;
    }

     public Long getportfolioid() {
        return this.portfolioid;
    }

    public String getcreationdate() {
        return this.creationdate;
    }

    public void setcreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

   
    








}