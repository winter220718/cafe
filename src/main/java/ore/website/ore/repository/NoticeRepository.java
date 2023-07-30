package ore.website.ore.repository;

import ore.website.ore.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    @Query(value="select * from (select rownum AS R, T.* from (select * from Notice order by notice_no DESC) T) where R between :startNo AND :endNo", nativeQuery=true)
    public java.util.List<Notice> getPageList(@Param(value="startNo")Integer startNo, @Param(value="endNo")Integer endNo);

    @Query(value="select count(notice_no) from Notice")
    public int getCount();

    @Modifying
    @Query("update Notice set NOTICE_HIT = NOTICE_HIT + 1 where NOTICE_NO = :noticeNo")
    public void addHit(@Param(value="noticeNo")Long noticeNo);
}
