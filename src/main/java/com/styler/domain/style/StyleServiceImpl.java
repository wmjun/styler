package com.styler.domain.style;

import com.styler.controller.api.dto.StyleDTO;
import com.styler.domain.tag.Tag;
import com.styler.domain.tag.TagRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@Service
@Transactional(readOnly = true)
public class StyleServiceImpl implements StyleService {

    @Autowired
    private StyleRepository styleRepository;

    @Autowired
    private TagRepository tagRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public StyleDTO getStyle(Long styleId) {
        Style style = styleRepository.findOne(styleId);
        StyleDTO styleDTO = null;
        if (style != null) {
            styleDTO = modelMapper.map(style, StyleDTO.class);
        }
        return styleDTO;
    }

    @Override
    public List<StyleDTO> getStylesByTagId(Long tagId) {
        Tag tag = tagRepository.findOne(tagId);
        List<StyleDTO> styleDTOs = new ArrayList<>();
        tag.getStyleBooks().forEach(sb -> {
            Style style = sb.getStyle();
            styleDTOs.add(modelMapper.map(style, StyleDTO.class));
        });

        return styleDTOs;
    }
}
