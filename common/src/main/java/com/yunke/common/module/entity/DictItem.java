package com.yunke.common.module.entity;

import lombok.Data;

/**
 * 字典项，具有父子关系
 */
@Data
public class DictItem {
    // 主键
    private Long id;

    // 字典id
    private Long dictId;

    // 字典编码
    private String code;

    // 父字典项id
    private Long parentId;

    // 名称
    private String name;

    // 数值
    private String value;

    // 描述
    private String desc;

    // 是否可见
    private Boolean visible;

    // 是否禁用
    private Boolean disabled;

    // 字体颜色
    private String fontColor;

    // 背景颜色
    private String backgroundColor;
}
