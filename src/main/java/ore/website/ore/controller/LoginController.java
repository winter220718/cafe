package ore.website.ore.controller;

import lombok.RequiredArgsConstructor;
import oracle.jdbc.proxy.annotation.Post;
import ore.website.ore.model.Member;
import ore.website.ore.service.LoginService;
import ore.website.ore.utils.MemberValidator;
import ore.website.ore.utils.SessionManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final SessionManager sessionManager;
    private final MemberValidator memberValidator;

    @GetMapping("/login")
    public String login() {


        return "/login&join/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("member") Member member, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        memberValidator.validate(member, bindingResult);

        // 로그인 실패시
        if (bindingResult.hasErrors()){
            return "/login&join/login";
        }

        // 로그인 성공시


        return "redirect:/home";
    }
}
