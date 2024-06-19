package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	/*
	 * 1. 스프링 프레임워크가 시작되면 먼저 스프링이 사용하는 메모리 영역을 만들게 되는데 이를 컨텍스트라고 합니다. 스프링에서는 ApplicationContext라는 이름의 객체가 만들어집니다.
	 * 2. 스프링은 자신이 객체를 생성하고 관리해야 하는 객체들에 대한 설정이 필요합니다. 이에 대한 설정이 root-context.xml 입니다.
	 * 3. root-context.xml에 설정되어 있는 context-component-scan 태그의 내용을 통해서 org.zerock.sample 패키지를 스캔하기 시작합니다.
	 * 4. Restaurant 객체는 Che 객체가 필요하는 어노테이션 @Autowired 설정이 있으므로 스프링은 Chef 객체의 레퍼런스를 Restaurant 객체에 주입합니다.
	 * */
}
