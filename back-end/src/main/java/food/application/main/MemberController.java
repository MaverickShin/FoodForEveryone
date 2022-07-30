package food.application.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 회원(사용자) 컨트롤러
 */
@Controller
public class MemberController {

    /**
     * @return
     */
    @GetMapping("/member/loginCheck")
    public Object loginCheck() {
        return null;
    }
}
