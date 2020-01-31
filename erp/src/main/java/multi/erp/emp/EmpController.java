package multi.erp.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//emp 테이블에서 작업하는 모든 내용에 대한 컨트롤러
@Controller
public class EmpController {
	@RequestMapping("/emp/login.do")
	public String login() {
		return "login";
	}
}