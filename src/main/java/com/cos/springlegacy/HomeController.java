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
	 * 1. ������ ���� - ������Ʈ�� , Form ������, Json 
	 * 2. ������ �ޱ� - ������Ʈ��, Form ������ <-������Ʈ �Ķ����� �޴´� x-www-url�θ� ������ �ִ�. dto������Ʈ�� ������
	 *                                                                   �ѹ濡 ������ �ִ�. �������� �����̺����� ���ٸ��Ѵ� �ۺ����� ������ �ƴ϶�
	 *                                                                   �Լ��� ����
	 * 3. Pathvariable ����غ��� -�߿��ϴ�
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// Controller ������̼��� �ִ� Ŭ�������� �Լ��� return�ϴ� ����
		// ViewResolver �� �����Ͽ� prefix�� suffix�� ����
		// �������� return���ش�.
		// ������Ʈ ������� �Ӹ��ƴ϶� ��Ĺ�� ������ ��簴ü �ȿ� ������Ʈ �������� ���� �� �Ű������ڸ��� ���⸸�ϸ� DI�� ����
		// request �� ��� => model
		// ���� ���Ӱ��̶� ����Ʈ ������ ������ �ִ�.������Ʈ �Ķ���� �������ִ�
		
		String username = "ssar";
		model.addAttribute("username", username); //Object Ÿ��
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestParam("id")String id,@RequestParam("pw")String pw, Model model) {//QueryString,x-www-formulencoded �ΰ��� ������ �ִ�.
		
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		// �𵨰� ������Ʈ �Ķ��� ��Ʈ�ѷ����� �˾ƺ���
		
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
//	public String jsonHome(@RequestParam("id")String id,@RequestParam("pw")String pw, Model model) {//QueryString,x-www-formulencoded �ΰ��� ������ �ִ�.
//			
//	
//		return "jsonHome";
//	}
}
