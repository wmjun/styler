package com.styler.domain.home;

import com.styler.domain.common.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wmjun on 2017. 4. 10..
 */

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    List<Home> findByActive(boolean active);

    Home findByGenderAndActive(Gender gender, boolean active);
}
