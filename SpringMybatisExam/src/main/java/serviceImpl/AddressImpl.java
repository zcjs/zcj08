package serviceImpl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import dto.AddressDto;
import service.AddressService;

public class AddressImpl extends SqlSessionDaoSupport implements AddressService{

	public AddressDto getAddress(int id) {
		return this.getSqlSession().selectOne("getAddress",id);
	}

}

		
