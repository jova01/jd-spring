package com.jpql.repository;

import com.jpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.email='sdubber7@t-online.de'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e where e.email='sdubber7@t-online.de'")
    Integer getEmployeeSalary();


    @Query("select e from Employee e where e.email= ?1")
    Employee getEmployeeWithEmail(String email);

    // Optional doesnt throw exception when null coming
   // Optional<Employee> getEmployeeWithEmail(String email);

    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Employee getEmployeeByEmailAndSalary(String email, int salary);


    @Query("select e from Employee e where e.email= :email")
    Employee getEmployeeByEmail(String email);

    @Query("select e from Employee e where e.email= :email and e.salary= :salary")
    Employee getEmployeeWithEmailAndSalary(String email, int salary);

    @Query("select e from Employee e where e.firstName=:name or e.salary =:salary")
    List<Employee> getEmployeeByFirstNameOrSalary(@Param("name") String name, int salary);

    @Query("select e from Employee e where e.salary <> ?1")
    List<Employee> getEmployeeBySalaryNotEqual(int salary);

    @Query("select e from Employee e where e.firstName like :pattern")
    List<Employee> getEmployeeByFirstNameLike(String pattern);

    @Query("select e from Employee e where e.salary < :salary")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    @Query("select e from Employee e where e.salary > :salary")
    List<Employee> getEmployeeBySalaryGreaterThan(int salary);

    @Query("select e from Employee e where e.salary between :salary1 and :salary2")
    List<Employee> getEmployeeBySalaryBetween(int salary1, int salary2);

    @Query("select e from Employee e where e.hireDate > :date")
    List<Employee> getEmployeeByHireDateBefore(LocalDate date);

    @Query("select e from Employee e where e.email is null")
    List<Employee> getEmployeeByEmailIsNull();

    @Query("select e from Employee e where e.email is not null")
    List<Employee> getEmployeeByEmailIsNotNull();
}
