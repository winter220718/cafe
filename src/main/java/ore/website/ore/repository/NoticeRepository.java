package ore.website.ore.repository;

import ore.website.ore.model.Category;
import ore.website.ore.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {


}
