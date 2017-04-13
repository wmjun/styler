package com.styler.domain.home;

import com.styler.controller.api.dto.HomeDTO;
import com.styler.domain.common.Gender;

import java.util.List;

/**
 * Created by wmjun on 2017. 4. 10..
 */
public interface HomeService {
    List<HomeDTO> getActiveHome();

    HomeDTO getActiveHomeByGender(Gender gender);
}
