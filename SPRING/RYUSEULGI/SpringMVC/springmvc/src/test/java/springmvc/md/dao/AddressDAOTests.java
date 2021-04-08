package springmvc.md.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;
import springmvc.md.domain.Address;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AddressDAOTests {
	
	@Autowired
	private AddressDAO addressDAO;
	
	@Test
	public void testList() {
		log.info("#list" + addressDAO.list());
	}
	
	@Test
	public void testInsert() {
		Address address = new Address(-1, "슬기", "seulgi", null);
		addressDAO.insert(address);
		log.info("insert success");
	}
	
	@Test
	public void testDelete() {
		long seq = 4L;
		addressDAO.delete(seq);
		log.info("delete success");
	}
}
