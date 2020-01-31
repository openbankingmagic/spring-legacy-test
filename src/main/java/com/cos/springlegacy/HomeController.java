package com.cos.springlegacy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;
import com.cos.springlegacy.dto.RequestJsonDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/*
	 * 1. 데이터 전달 - 쿼리스트링 , Form 데이터, Json 
	 * 2. 데이터 받기 - 쿼리스트링, Form 데이터 <-리퀘스트 파람으로 받는다 x-www-url로만 받을수 있다. dto오브젝트로 받으면
	 *                                                                   한방에 받을수 있다. 스프링도 프라이빗에는 접근못한다 퍼블릭에만 변수가 아니라
	 *                                                                   함수에 접근
	 * 3. Pathvariable 사용해보기 -중요하다
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// Controller 어노테이션이 있는 클래스에서 함수가 return하는 순간
		// ViewResolver 가 관여하여 prefix와 suffix를 만들어서
		// 페이지를 return해준다.
		// 리퀘스트 모든정보 뿐만아니라 톰캣이 가지는 모든객체 안에 리퀘스트 리스폰스 세션 등 매개변수자리에 적기만하면 DI다 주입
		// request 에 담기 => model
		// 폼의 네임값이랑 포스트 데이터 받을수 있다.리퀘스트 파라미터 받을수있다
		
		String username = "ssar";
		model.addAttribute("username", username); //Object 타입
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestParam("id")String id,@RequestParam("pw")String pw, Model model) {//QueryString,x-www-formulencoded 두값만 받을수 있다.
		
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		// 모델과 리퀘스트 파람을 컨트롤러에서 알아보자
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "hello";
	}
	
	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public String goodbye(RequestInfoDto requestInfoDto) {
		
		System.out.println("addr: " + requestInfoDto.getAddr());
		System.out.println("hobby: " + requestInfoDto.getHobby());
		return "goodbye";
	}
//	@RequestMapping(value = "/jsonHome", method = RequestMethod.POST)
//	public String jsonHome(@RequestParam("id")String id,@RequestParam("pw")String pw, Model model) {//QueryString,x-www-formulencoded 두값만 받을수 있다.
//			
//	
//		return "jsonHome";
//	}
}
