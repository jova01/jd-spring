package com.jpql.repository;

import com.jpql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    @Query("select d from Department d where d.division in(?1,?2)")
    List<Department> getDepartmentByDivisionIn(String d1, String d2);

    @Query("select d from Department d where d.division in(?1)")
    List<Department> getDepartmentByDivisionInList(List<String> division);


    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContains(String pattern);

    List<Department> findDepartment(String divison);


    List<Department> countAllDepartments();
}
