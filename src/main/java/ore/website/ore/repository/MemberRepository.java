package ore.website.ore.repository;

import ore.website.ore.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMemEmail(String memEmail);

}
