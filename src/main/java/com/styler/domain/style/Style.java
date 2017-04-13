package com.styler.domain.style;

import com.styler.domain.common.BaseEntity;
import com.styler.domain.common.Gender;
import com.styler.domain.stylebook.StyleBook;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@Entity
@Getter
@Setter
@Table(name = "styles")
public class Style extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long styleId;

    private String styleName;

    private String description;

    private String imgPath;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "style")
    private List<StyleBook> styleBooks;
}
