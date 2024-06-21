package com.yunke.common.module.entity;

import com.yunke.common.enums.DictTypeEnum;
import lombok.Data;

/**
 * 数据字典，存储系统中枚举数据
 */
@Data
public class Dict {
    // 主键
    private Long id;

    // 名称
    private String name;

    // 编码
    private String code;

    // 类型，对应前端组件类型
    private DictTypeEnum type;

    // 是否系统级别
    private Boolean system;

    // 备注
    private String remark;

}
