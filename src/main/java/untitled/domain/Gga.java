package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext483Application;

@Entity
@Table(name = "Gga_table")
@Data
//<<< DDD / Aggregate Root
public class Gga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static GgaRepository repository() {
        GgaRepository ggaRepository = BoundedContext483Application.applicationContext.getBean(
            GgaRepository.class
        );
        return ggaRepository;
    }
}
//>>> DDD / Aggregate Root
