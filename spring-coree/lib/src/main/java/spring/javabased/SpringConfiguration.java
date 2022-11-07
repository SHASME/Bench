package spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean(initMethod ="init", destroyMethod ="destroy")
	public Item getItem() {
		Item item = new Item();
		item.setCode(100);
		item.setItemname("Keyboard");
		item.setQuantity(10);
		return item;
		
	}
}
