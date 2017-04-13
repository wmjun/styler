package com.styler.domain.homeitem;

import com.styler.domain.common.BaseEntity;
import com.styler.domain.home.Home;
import com.styler.domain.tag.Tag;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by wmjun on 2017. 4. 10..
 */
@Entity
@Getter
@Setter
@Table(name = "home_items")
public class HomeItem extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeItemId;

    @OneToOne
    @JoinColumn(name = "tagId")
    private Tag tag;

    @ManyToOne
    @JoinColumn(name = "homeId")
    private Home home;

    private Integer order;

}
