package ore.website.ore.model;

import javax.persistence.*;

@Entity
@Table(name ="Notice")
@SequenceGenerator(
        name = "notice_no_generator",
        sequenceName = "notice_no_seq", // 시퀸스 명
        initialValue = 4, // 초기 값
        allocationSize = 1 // 미리 할당 받을 시퀸스 수
)
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notice_no_generator")
    @Column(name= "Notice_no")
    private Long noticeNo;

    @Column(name="NOTICE_TITLE")
    private String noticeTitle;

    @Column(name="NOTICE_CN")
    private String noticeCn;

    @Column(name="NOTICE_DATE")
    private String noticeDate;

    @Column(name="NOTICE_HIT")
    private Integer noticeHit;


    @Column(name="MEM_NO")
    private Long memNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEM_NO", referencedColumnName = "MEM_NO", insertable = false, updatable = false)
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Long getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(Long noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeCn() {
        return noticeCn;
    }

    public void setNoticeCn(String noticeCn) {
        this.noticeCn = noticeCn;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Integer getNoticeHit() {
        return noticeHit;
    }

    public void setNoticeHit(Integer noticeHit) {
        this.noticeHit = noticeHit;
    }

    public Long getMemNo() {
        return memNo;
    }

    public void setMemNo(Long memNo) {
        this.memNo = memNo;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeNo=" + noticeNo +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeCn='" + noticeCn + '\'' +
                ", noticeDate='" + noticeDate + '\'' +
                ", noticeHit=" + noticeHit +
                ", memNo=" + memNo +
                ", member=" + member +
                '}';
    }
}
