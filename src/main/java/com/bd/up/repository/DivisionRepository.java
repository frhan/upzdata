package com.bd.up.repository;

import com.bd.up.domain.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farhan on 8/16/16.
 */
@Repository
public interface DivisionRepository extends JpaRepository<Division,Long> {
}
