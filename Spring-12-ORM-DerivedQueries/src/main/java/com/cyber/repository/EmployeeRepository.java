package com.cyber.repository;

import com.cyber.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastname, String email);

    List<Employee> findByFirstNameNot(String firstname);

    List<Employee> findByLastNameStartsWith(String pattern);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findBySalaryLessThanEqual(Integer salary);

    List<Employee> findByHireDateBetween(LocalDate start, LocalDate end);

    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    List<Employee> findByEmailIsNull();

    @Query("select e from Employee e where e.email= 'acurwood6@1und1.de'")
    Employee getEmployeeDetail();

    @Query("select e from Employee e where e.email= :email")
    Employee getEmployeeByEmail(String email);
}
