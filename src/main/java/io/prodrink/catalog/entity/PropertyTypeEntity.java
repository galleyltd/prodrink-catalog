package io.prodrink.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "property_types")
@Entity
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
