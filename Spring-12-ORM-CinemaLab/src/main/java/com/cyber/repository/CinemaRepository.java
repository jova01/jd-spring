package com.cyber.repository;

import com.cyber.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

    // ------------------- DERIVED QUERIES ------------------- //
    Optional<Cinema> findByName(String name);

    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredNameAsc(String pattern);

    List<Cinema> findAllByLocationCountry(String country);

    List<Cinema> findAllByNameOrSponsoredName(String name, String sponsoredName);


    // ------------------- JPQL QUERIES ------------------- //
    @Query("select c.name from Cinema c where c.id=:id")
    String fetchByIdJPQL(Integer id);

    // ------------------- Native QUERIES ------------------- //
    @Query(value = "select * from cinema c join location l on l.id=c.location_id where l.country=?1", nativeQuery = true)
    List<Cinema> retrieveAllByLocationCountry(String locationCountry);

    @Query(value = "select * from cinema where name ILIKE concat('%', ?1, '%') or sponsored_name ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Cinema> retrieveAllByNameOrSponsoredName(String pattern);

    @Query(value = "select * from cinema order by name", nativeQuery = true)
    List<Cinema> sortByName();

    // write a native query to distinct all cinemas by sponsored name
    @Query(value = "select distinct sponsored_name from cinema", nativeQuery = true)
    List<String> distinctBySponsoredName();
}
