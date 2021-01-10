package com.jpql.entity;

import jdk.jfr.Name;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "departments")
@NamedQuery(name = "Department.findDepartment",
            query = "select d from Department d where d.division=?1")

@NamedNativeQuery(name = "Department.countAllDepartments",
                  query = "select * from departments",
                  resultClass = Department.class)
public class Department {

    @Id
    String department;
    String division;

}
