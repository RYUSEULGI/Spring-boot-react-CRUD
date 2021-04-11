package com.test.mapper;

import com.test.domain.Board;

@Log
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testList() {
		log.info("#list" + boardMapper.list());
	}
	
	@Test
	public void testInsert() {
		Address address = new Address(-1, "슬기", "seulgi", null);
		boardMapper.insert(address);
		log.info("insert success");
	}
	
	@Test
	public void testDelete() {
		long seq = 4L;
		boardMapper.delete(seq);
		log.info("delete success");
	}
}
