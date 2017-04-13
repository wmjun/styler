package com.styler.domain.stylebook;

import com.styler.domain.common.BaseEntity;
import com.styler.domain.style.Style;
import com.styler.domain.tag.Tag;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@Entity
@Getter
@Setter
@Table(name = "stylebooks")
public class StyleBook extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long styleBookId;

    @ManyToOne
    @JoinColumn(name = "tagId")
    private Tag tag;

    @ManyToOne
    @JoinColumn(name = "styleId")
    private Style style;
}
