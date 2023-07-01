package ore.website.ore.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @Column(name = "CTG_NO")
    private Long ctgNo;

    @Column(name="CTG_NAME")
    private String ctgName;

    @Column(name="CTG_CN")
    private String ctgCn;

    @Column(name="CTG_RM")
    private String ctgRm;

    public Long getCtgNo() {
        return ctgNo;
    }

    public void setCtgNo(Long ctgNo) {
        this.ctgNo = ctgNo;
    }

    public String getCtgName() {
        return ctgName;
    }

    public void setCtgName(String ctgName) {
        this.ctgName = ctgName;
    }

    public String getCtgCn() {
        return ctgCn;
    }

    public void setCtgCn(String ctgCn) {
        this.ctgCn = ctgCn;
    }

    public String getCtgRm() {
        return ctgRm;
    }

    public void setCtgRm(String ctgRm) {
        this.ctgRm = ctgRm;
    }
}
