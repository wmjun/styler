package com.styler.domain.home;

import com.styler.domain.common.BaseEntity;
import com.styler.domain.common.Gender;
import com.styler.domain.homeitem.HomeItem;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wmjun on 2017. 4. 10..
 */

@Entity
@Getter
@Setter
@Table(name = "homes")
public class Home extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeId;

    private String homeName;

    private String description;

    private Gender gender;

    @OneToMany(mappedBy = "home")
    private List<HomeItem> homeItemList;

    private boolean active;

}
