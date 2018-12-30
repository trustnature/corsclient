package xyz.tuny.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/get1")
	public ResultBean get(){
		System.out.println("get1");
		return new ResultBean("get1 ok");
	}
}
