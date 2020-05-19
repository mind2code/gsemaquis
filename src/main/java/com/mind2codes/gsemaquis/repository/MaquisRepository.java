package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.Maquis;

@Repository
public interface MaquisRepository extends JpaRepository<Maquis, Long> {

}
