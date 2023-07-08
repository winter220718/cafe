package ore.website.ore.controller;

import ore.website.ore.model.Member;
import ore.website.ore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/join")
public class MemberController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String join() {

        return "/join";
    }

    @PostMapping
    public String signUp(@ModelAttribute("member") Member member) {
        System.out.println("흠");
        userRepository.save(member);

        return "signUp-success";
    }

}
