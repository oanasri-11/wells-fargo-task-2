

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class  Security{


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManytoOne
    @JoinColumn(name="portfolioid")
    private Portfolio portfolios;


    private Long securityid;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private Double purchaseprice;

    @Column(nullable=false)
    private String purchasedate;
    
    @Column(nullable=false)
    private String quantity;
    
    //Constructor
    public class Security(Long securityidtid, String name,String category,Double purchaseprice,String purchasedate,String quantity ){
        this.name=name;
        this.category=category;
        this.purchaseprice=purchaseprice;
        this.purchasedate=purchasedate;
        this.quantityquantity;
    }

     public Long getsecurityid() {
        return this.securityidid;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name= name;
    }

    public String getcategory() {
        return this.category}

    public void setcategory(String category) {
        this.category = category
    }

    public String getpurchaseprice() {
        return this.purchaseprice;
    }

    public void setapurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchasedate;
    }

    public String getpurchasedate() {
        return this.purchasedate;
    }

    public void setpurchasedate(String purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getquantity() {
        return this.quantity;
    }

    public void sequantity(String quantity) {
        this.quantity = quantity;
    }

    
}
