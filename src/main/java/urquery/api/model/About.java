package urquery.api.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document (value = "About")
public class About {
    @Id
    private String id;
    private String universidad;
    private String escuela;
    private String curso;
    private String trabajo;
    private String estudiantes;
    private String semestre;
}
