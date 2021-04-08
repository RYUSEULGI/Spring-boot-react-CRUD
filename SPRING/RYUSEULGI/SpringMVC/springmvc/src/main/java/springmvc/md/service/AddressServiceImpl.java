package springmvc.md.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.md.dao.AddressDAO;
import springmvc.md.domain.Address;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDAO addressDao;

	@Override
	public List<Address> listS() {
		return addressDao.list();
	}

	@Override
	public void insert(Address address) {
		addressDao.insert(address);
	}

	@Override
	public void delete(long seq) {
		addressDao.delete(seq);
	}

}
