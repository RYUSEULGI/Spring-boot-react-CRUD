package springmvc.md.mapper;

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
public class AddressMapperTests {
	
	@Autowired
	private AddressMapper addressMapper;
	
//	@Test
//	public void testList() {
//		log.info("#list" + addressMapper.list());
//	}
//	
//	@Test
//	public void testInsert() {
//		Address address = new Address(-1, "슬기", "seulgi", null);
//		addressMapper.insert(address);
//		log.info("insert success");
//	}
	
	@Test
	public void testDelete() {
		long seq = 4L;
		addressMapper.delete(seq);
		log.info("delete success");
	}
}
