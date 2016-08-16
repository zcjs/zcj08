package service;

import dto.CustomerDto;;

public interface CustomerService {
	public void addCustomer(CustomerDto customerDto);
	public void deleteCustomer(int i);
}
