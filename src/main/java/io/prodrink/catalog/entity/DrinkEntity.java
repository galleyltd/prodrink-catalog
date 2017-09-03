package io.prodrink.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "drinks")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DrinkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(name = "image_urls", nullable = false)
    private String imageUrls;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "drinkEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PropertyEntity> properties;
}
