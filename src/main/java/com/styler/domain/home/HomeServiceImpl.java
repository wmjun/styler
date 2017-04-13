package com.styler.domain.home;

import com.styler.controller.api.dto.HomeDTO;
import com.styler.controller.api.dto.HomeItemDTO;
import com.styler.domain.common.Gender;
import com.styler.domain.homeitem.HomeItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wmjun on 2017. 4. 10..
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public List<HomeDTO> getActiveHome() {
        List<Home> homeList = homeRepository.findByActive(true);
        return homeList.stream().map(home -> convertToHomeDTO(home)).collect(Collectors.toList());
    }

    @Override
    public HomeDTO getActiveHomeByGender(Gender gender) {
        Home home = homeRepository.findByGenderAndActive(gender, true);
        return convertToHomeDTO(home);
    }

    private HomeDTO convertToHomeDTO(Home home) {
        HomeDTO homeDTO = new HomeDTO();

        homeDTO.setHomeId(home.getHomeId());
        homeDTO.setHomeName(home.getHomeName());
        homeDTO.setGender(home.getGender().name());
        homeDTO.setDescription(home.getDescription());
        homeDTO.setActive(home.isActive());

        List<HomeItem> homeItemList = home.getHomeItemList();
        List<HomeItemDTO> homeItemDTOList = new ArrayList<>();
        homeItemList.forEach(homeItem -> {
            HomeItemDTO homeItemDTO = new HomeItemDTO();
            homeItemDTO.setTagId(homeItem.getTag().getTagId());
            homeItemDTO.setTagName(homeItem.getTag().getTagName());
            homeItemDTO.setRepresentativeStyleName(homeItem.getTag().getRepresentativeStyle().getStyleName());
            homeItemDTO.setRepresentativeStyleImgPath(homeItem.getTag().getRepresentativeStyle().getImgPath());
            homeItemDTO.setOrder(homeItem.getOrder());
            homeItemDTOList.add(homeItemDTO);
        });

        homeDTO.setHomeItemList(homeItemDTOList);

        return homeDTO;

    }

}
