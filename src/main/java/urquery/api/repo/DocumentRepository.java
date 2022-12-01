package urquery.api.repo;

import org.springframework.stereotype.Repository;
import urquery.api.model.Documento;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface DocumentRepository extends MongoRepository<Documento, String> {
}
