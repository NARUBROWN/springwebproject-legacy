package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.Setter;
import lombok.extern.log4j.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	/*
	 * Autowired는 스프링 내부에서 자신이 특정한 객체에 의존적이므로 자신에게 해당 타입의 빈을 주입해주라는 표시이다.
	 * 스프링은 @Autowired 어노테이션을 보고 스프링 내부에 관리되는 객체들 중에 적당한 것이 있는지를 확인하고 자동으로 주입해 줍니다.
	 * */
	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant;
	
	@Test
	public void textExist() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("--------------------");
		log.info(restaurant.getChef());
	}
	

}
