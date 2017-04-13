package com.styler.domain.style;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@Repository
public interface StyleRepository extends JpaRepository<Style, Long>, StyleRepositoryCustom {
}
