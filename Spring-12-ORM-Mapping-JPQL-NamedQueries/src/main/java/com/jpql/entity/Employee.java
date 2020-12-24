package com.jpql.entity;

import com.jpql.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
//@Entity(name = "Employees")
@Table(name = "employees")
public class Employee extends BaseEntity{

    String firstName;
    String lastName;
    String email;

    @Column(columnDefinition = "DATE")
    LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne
    private Region region;

}
