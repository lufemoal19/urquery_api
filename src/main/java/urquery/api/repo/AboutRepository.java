package urquery.api.repo;

import org.springframework.stereotype.Repository;
import urquery.api.model.About;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface AboutRepository extends MongoRepository<About, String>
{

}
