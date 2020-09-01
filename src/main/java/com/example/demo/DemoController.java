
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${book.name}")
	private String bookName; // 注入第一个配置外部文件属性

	private final Logger log = LoggerFactory.getLogger(DemoController.class);

	@GetMapping(value = "test1/{abc}")
	public String test1(@PathVariable String abc) throws Exception {
		log.info("参数值={}", abc);
		return abc;
	}

	@GetMapping(value = "test1k")
	public String test1k() throws Exception {
		Thread.sleep(1000);
		return "test1k";
	}

}
