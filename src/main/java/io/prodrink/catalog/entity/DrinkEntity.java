package io.prodrink.catalog.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "drinks")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DrinkEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    @Column(name = "image_urls")
    private String imageUrls;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "drinkEntity", fetch = FetchType.EAGER)
    private List<PropertyEntity> properties;
}
