package zcj.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ObjectMapper {
	/**
	 * 在结果集中将一条记录转换成实体对象
	 * @param rs 查询获得的结果集
	 * @return	当前转换的实体对	 * @throws SQLException 
	 */
	public Object mapObject(ResultSet rs) throws SQLException;
}
