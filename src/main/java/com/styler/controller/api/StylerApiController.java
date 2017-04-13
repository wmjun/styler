package com.styler.controller.api;

import com.styler.controller.api.dto.StyleDTO;
import com.styler.domain.style.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@RestController
@RequestMapping("/api/styles")
public class StylerApiController {

    @Autowired
    private StyleService styleService;

    @RequestMapping(value = "/{styleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public StyleDTO getStyle(@PathVariable Long styleId) {
        return styleService.getStyle(styleId);
    }

    @RequestMapping(value = "/tags/{tagId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<StyleDTO> getStylesByTagId(@PathVariable Long tagId) {
        return styleService.getStylesByTagId(tagId);
    }
}