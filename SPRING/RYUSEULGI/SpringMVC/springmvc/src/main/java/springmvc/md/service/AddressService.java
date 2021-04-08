package springmvc.md.service;

import java.util.List;

import springmvc.md.domain.Address;

public interface AddressService {
	List<Address> listS();
	void insert(Address address);
	void delete(long seq);
}
