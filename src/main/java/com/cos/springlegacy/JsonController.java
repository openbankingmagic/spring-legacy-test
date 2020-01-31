package com.cos.springlegacy;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

// 컨트롤러를 써야 메모리에 뜬다 IoC
@Controller
public class JsonController {

	// 스프링은 form의 name값과 혹은 쿼리스트링만 오브젝트로 자동 변환!!
	@RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonHome(@RequestBody RequestJsonDto requestJsonDto) {
				//버퍼드라이터			//버퍼드리더다                   //버퍼드리더
		//리퀘스트 바디를 붙이면 버퍼드 리더가 실행되는거다
		System.out.println(requestJsonDto.getId());
		return requestJsonDto;//뷰리졸버를 호출하니 이게 파일명이다. 이자리에 스트링을 리퀘스트제이슨디티오로 바꾸고 
	}
	// http://localhost:8080/springlegacy/jsonHome/뭘넣어도 다 호출된다. 안녕넣어도 페이징할때 쓴다.
	@RequestMapping(value = "/jsonHome/{num}", method = RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		
		System.out.println("num: "+num);
		
		return "jsonHome";
	}
}
