package okdk.okdkserver.app.keyosk.repository;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Category2 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Category1 category1;


    @NonNull
    private String name;
}
