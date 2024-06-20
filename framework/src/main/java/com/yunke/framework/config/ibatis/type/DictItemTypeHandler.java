package com.yunke.framework.config.ibatis.type;

import com.yunke.common.module.entity.DictItem;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义Mybatis的TypeHandler
 * 当DictItem类型的数据存入数据库时，只会取出DictItem的value值进行存入数据库
 * 当DictItem类型的数据从数据库取出时，会将数据库存储的值设置为DictItem的value值，后续在自定义的Mybatis拦截器，根据DictItem上的注解完整的设置值。
 */
@MappedTypes(DictItem.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class DictItemTypeHandler extends BaseTypeHandler<DictItem> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, DictItem DictItem, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, DictItem.getValue());
    }

    @Override
    public DictItem getNullableResult(ResultSet resultSet, String s) throws SQLException {
        DictItem DictItem = new DictItem();
        DictItem.setValue(resultSet.getString(s));
        return DictItem;
    }

    @Override
    public DictItem getNullableResult(ResultSet resultSet, int i) throws SQLException {
        DictItem DictItem = new DictItem();
        DictItem.setValue(resultSet.getString(i));
        return DictItem;
    }

    @Override
    public DictItem getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        DictItem DictItem = new DictItem();
        DictItem.setValue(callableStatement.getString(i));
        return DictItem;
    }
}
