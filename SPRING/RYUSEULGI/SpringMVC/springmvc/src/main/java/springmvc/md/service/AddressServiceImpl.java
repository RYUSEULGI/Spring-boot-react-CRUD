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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long seq) {
		// TODO Auto-generated method stub
		
	}

}
