package com.jpql.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "regions")
public class Region extends BaseEntity{
    private String region;
    private String country;
}
