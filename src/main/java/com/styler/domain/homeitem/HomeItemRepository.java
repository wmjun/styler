package com.styler.domain.homeitem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wmjun on 2017. 4. 10..
 */
@Repository
public interface HomeItemRepository extends JpaRepository<HomeItem, Long> {
}
