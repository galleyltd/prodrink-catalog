package io.prodrink.catalog.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "property_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyTypeEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @Column(name = "value_type")
    private String valueType;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
