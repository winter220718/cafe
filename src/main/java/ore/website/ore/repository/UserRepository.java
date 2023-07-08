package ore.website.ore.repository;

import ore.website.ore.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Member, String> {

}
