package com.cyber.repository;

import com.cyber.entity.Account;
import com.cyber.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //
    List<Account> findAllByCountryOrState(String country, String state);

    List<Account> findAllByAgeLessThanEqual(Integer age);

    List<Account> findAllByRole(UserRole role);

    List<Account> findAllByAgeBetween(Integer age1, Integer age2);

    List<Account> findByAddressStartingWith(String address);

    List<Account> findByOrderByAgeDesc();


    // ------------------- JPQL QUERIES ------------------- //
    @Query("select a from Account a")
    List<Account> fetchAllJPQL();

    @Query("select a from Account a where a.role='Admin'")
    List<Account> fetchAdminAccounts();

    @Query("select a from Account a order by a.age desc")
    List<Account> orderWithAgeJPQL();

    // ------------------- Native QUERIES ------------------- //
    @Query(value = "select * from account_details where age < :age", nativeQuery = true)
    List<Account> retrieveAllByAgeLowerThan(Integer age);

    @Query(value = "select * from account_details where name ILIKE concat('%', ?1, '%') or country ILIKE concat('%', ?1, '%') or state ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Account>  retrieveBySearchCriteria(String pattern);

    @Query(value = "select * from account_details where age> ?1", nativeQuery = true)
    List<Account> retrieveLessThanAge(int age);
}
