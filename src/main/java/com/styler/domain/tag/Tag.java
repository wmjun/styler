package com.styler.domain.tag;

import com.styler.domain.common.BaseEntity;
import com.styler.domain.style.Style;
import com.styler.domain.stylebook.StyleBook;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@Getter
@Setter
@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagId;

    private String tagName;

    @OneToOne
    @JoinColumn(name = "representativeStyleId")
    private Style representativeStyle;

    @OneToMany(mappedBy = "tag")
    private List<StyleBook> styleBooks;
}