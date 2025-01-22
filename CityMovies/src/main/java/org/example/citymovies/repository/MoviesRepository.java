package org.example.citymovies.repository;

import org.example.citymovies.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {

    @Query(value = "select * from movies where city_id = :id",nativeQuery = true)
    List<Movies> findByCityId (String id);
}
