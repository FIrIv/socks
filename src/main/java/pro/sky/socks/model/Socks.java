package pro.sky.socks.model;

import jakarta.persistence.Column;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "socks")
public class Socks {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @EqualsAndHashCode.Exclude
    @Column(name = "color")
    private String color;

    @EqualsAndHashCode.Exclude
    @Column(name="cotton_part")
    private Integer cottonPart;

    @EqualsAndHashCode.Exclude
    @Column(name="quantity")
    private Integer quantity;
}
