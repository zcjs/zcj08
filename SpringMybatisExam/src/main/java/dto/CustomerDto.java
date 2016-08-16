package dto;

import java.util.Date;

public class CustomerDto {
	private int customer_id;
	private int store_id;
	private String first_name;
	private String last_name;
	private String email;
	private int address_id;
	private int active;
	private Date create_date;
	private Date last_update;
	public CustomerDto() {
		
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getFiest_name() {
		return first_name;
	}
	public void setFiest_name(String fiest_name) {
		this.first_name = fiest_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "CustomerDto [customer_id=" + customer_id + ", store_id=" + store_id + ", fiest_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", address_id=" + address_id + ", active=" + active
				+ ", create_date=" + create_date + ", last_update=" + last_update + "]";
	}

}
