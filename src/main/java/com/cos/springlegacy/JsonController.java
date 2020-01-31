package com.cos.springlegacy;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

// ��Ʈ�ѷ��� ��� �޸𸮿� ��� IoC
@Controller
public class JsonController {

	// �������� form�� name���� Ȥ�� ������Ʈ���� ������Ʈ�� �ڵ� ��ȯ!!
	@RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonHome(@RequestBody RequestJsonDto requestJsonDto) {
				//���۵������			//���۵帮����                   //���۵帮��
		//������Ʈ �ٵ� ���̸� ���۵� ������ ����Ǵ°Ŵ�
		System.out.println(requestJsonDto.getId());
		return requestJsonDto;//�丮������ ȣ���ϴ� �̰� ���ϸ��̴�. ���ڸ��� ��Ʈ���� ������Ʈ���̽���Ƽ���� �ٲٰ� 
	}
	// http://localhost:8080/springlegacy/jsonHome/���־ �� ȣ��ȴ�. �ȳ�־ ����¡�Ҷ� ����.
	@RequestMapping(value = "/jsonHome/{num}", method = RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		
		System.out.println("num: "+num);
		
		return "jsonHome";
	}
}
