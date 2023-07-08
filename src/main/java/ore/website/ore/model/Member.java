package ore.website.ore.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="MEMBER")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEM_EMAIL")
    private String memEmail;

    @Column(name = "MEM_NM")
    private String memName;

    @Column(name = "MEM_PW")
    private String memPw;

    @Column(name = "MEM_BTH")
    private Date memBth;

    @Column(name = "KAKAO_YN")
    private boolean kakaoYn;

    @Column(name = "STAMP")
    private int stamp;

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPw() {
        return memPw;
    }

    public void setMemPw(String memPw) {
        this.memPw = memPw;
    }

    public Date getMemBth() {
        return memBth;
    }

    public void setMemBth(Date memBth) {
        this.memBth = memBth;
    }

    public boolean isKakaoYn() {
        return kakaoYn;
    }

    public void setKakaoYn(boolean kakaoYn) {
        this.kakaoYn = kakaoYn;
    }

    public int getStamp() {
        return stamp;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }
}
