package com.styler.domain.style;

import com.styler.controller.api.dto.StyleDTO;

import java.util.List;

/**
 * Created by wmjun on 2017. 4. 8..
 */
public interface StyleService {
    StyleDTO getStyle(Long styleId);

    List<StyleDTO> getStylesByTagId(Long tagId);


}
