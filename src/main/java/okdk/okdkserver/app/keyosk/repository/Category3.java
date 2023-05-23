package okdk.okdkserver.app.keyosk.repository;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Category3 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Category2 category2;


    @NonNull
    private String name;
}
