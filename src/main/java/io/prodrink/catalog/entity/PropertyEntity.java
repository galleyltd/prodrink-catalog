package io.prodrink.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "properties")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private DrinkEntity drinkEntity;

    @ManyToOne
    @JoinColumn(name = "property_type_id")
    private PropertyTypeEntity propertyTypeEntity;
    private String value;
}
