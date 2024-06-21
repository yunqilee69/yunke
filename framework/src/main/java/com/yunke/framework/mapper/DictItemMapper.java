package com.yunke.framework.mapper;

import com.yunke.common.module.entity.DictItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictItemMapper {

    List<DictItem> selectAll();

}
