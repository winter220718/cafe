package ore.website.ore.repository;

import ore.website.ore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>  {


}
