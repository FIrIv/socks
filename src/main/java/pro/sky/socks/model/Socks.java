package pro.sky.socks.model;

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
    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;

    @EqualsAndHashCode.Exclude
    @Column(name="cotton_part")
    private Integer cottonPart;

    @EqualsAndHashCode.Exclude
    @Column(name="quantity")
    private Integer quantity;
}
