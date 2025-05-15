package ore.website.ore.model;


import javax.persistence.*;

@Entity
@Table(name ="MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MENU_NO")
    private Long menuNo;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_PRICE")
    private Long menuPrice;

    @Column(name = "MENU_IMAGE")
    private String menuImage;

    @Column(name ="CTG_NO")
    private Long ctgNo;

    public Long getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Long menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Long menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    public Long getCtgNo() {
        return ctgNo;
    }

    public void setCtgNo(Long ctgNo) {
        this.ctgNo = ctgNo;
    }
}
