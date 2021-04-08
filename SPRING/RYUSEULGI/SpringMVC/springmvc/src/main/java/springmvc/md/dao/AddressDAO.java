package springmvc.md.dao;

import java.util.List;

import springmvc.md.domain.Address;

public interface AddressDAO {
	public abstract List<Address> list();
	public abstract void insert(Address address);
	public abstract void delete(long seq);
}
