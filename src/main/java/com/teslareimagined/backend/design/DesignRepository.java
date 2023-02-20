package com.teslareimagined.backend.design;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignRepository extends CrudRepository<Design, Long> {
    List<Design> findAllByOrderByIdAsc();
}
