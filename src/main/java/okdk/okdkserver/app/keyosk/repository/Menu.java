package okdk.okdkserver.app.keyosk.repository;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Category1 category1;


    @NonNull
    private String name;

    @NonNull
    private String originalFileName;

    @NonNull
    private String storedFileName;

    @NonNull
    private Long price;

    @Builder
    public Menu(Long id, String name, String storePath){
        this.id=id;
        this.name=name;
        this.storedFileName= storePath;
        this.price=price;
    }
}
