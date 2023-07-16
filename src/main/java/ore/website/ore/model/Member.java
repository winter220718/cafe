package ore.website.ore.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="MEMBER")
@SequenceGenerator(
        name = "mem_no_generator",
        sequenceName = "mem_no_seq", // 시퀸스 명
        initialValue = 1, // 초기 값
        allocationSize = 1 // 미리 할당 받을 시퀸스 수
)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mem_no_generator")
    @Column(name= "MEM_NO")
    private Long memNo;

    @Column(name = "MEM_NM")
    private String memName;

    @Column(name = "MEM_EMAIL")
    private String memEmail;

    @Column(name = "MEM_PW")
    private String memPw;

    @Column(name = "MEM_BTH")
    private Integer memBth;

    @Column(name = "KAKAO_YN")
    private boolean kakaoYn;

    @Column(name = "STAMP")
    private int stamp;

    public Long getMemNo() {
        return memNo;
    }

    public void setMemNo(Long memNo) {
        this.memNo = memNo;
    }

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

    public Integer getMemBth() {
        return memBth;
    }

    public void setMemBth(Integer memBth) {
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

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", memName='" + memName + '\'' +
                ", memEmail='" + memEmail + '\'' +
                ", memPw='" + memPw + '\'' +
                ", memBth=" + memBth +
                ", kakaoYn=" + kakaoYn +
                ", stamp=" + stamp +
                '}';
    }
}
