package serviceImpl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import dto.CustomerDto;
import service.CustomerService;

public class CustomerImpl extends SqlSessionDaoSupport implements CustomerService{

	public void addCustomer(CustomerDto customer) {
		this.getSqlSession().selectOne("addCustomer",customer);
	}

	public void deleteCustomer(int i) {
		this.getSqlSession().selectOne("deleteCustomer",i);
	}

	
}
