package com.styler.controller.api.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wmjun on 2017. 4. 11..
 */
@Getter
@Setter
public class HomeItemDTO {
    private Long tagId;
    private String tagName;
    private String representativeStyleName;
    private String representativeStyleImgPath;
    private int order;
}
