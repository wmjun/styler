package com.styler.controller.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by wmjun on 2017. 4. 10..
 */
@Getter
@Setter
public class HomeDTO {
    private Long homeId;
    private String homeName;
    private String description;
    private String gender;
    private boolean active;
    private List<HomeItemDTO> homeItemList;
}
