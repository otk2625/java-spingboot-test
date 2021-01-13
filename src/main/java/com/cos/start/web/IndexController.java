package com.cos.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//데이터를 읽는다
@RestController

//파일을 읽는다
//@Controller
public class IndexController {
	
	//  http://localhost:8080/start/index
	@GetMapping("/index")
	public String index() {
		return "index함수입니다.";
	}
	
	// tomcat-embeded-jasper 라이브러리는 기본 경로를 /src/main/webapp
	// preffix /views/
	// suffix .jsp
	@GetMapping("/hello")
	public String hello() {
		return "hello";  // /src/main/webapp/hello.jsp  == ViewResolover == @Controller
	}
}
