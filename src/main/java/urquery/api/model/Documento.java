package urquery.api.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(value = "Documento")
public class Documento {
    @Id
    private String id;
    private String name;
    private String bodyDocument;
}
