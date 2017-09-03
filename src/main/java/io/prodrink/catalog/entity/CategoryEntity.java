package io.prodrink.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "categories")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private CategoryEntity parentCategoryEntity;

    @Column(name = "image_url")
    private String imageUrl;
}
