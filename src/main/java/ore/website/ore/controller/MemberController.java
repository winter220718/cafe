package ore.website.ore.controller;

import ore.website.ore.model.Member;
import ore.website.ore.repository.MemberRepository;
import ore.website.ore.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

@Controller
@RequestMapping("/join")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public String join() {

        return "/login&join/join";
    }

    @PostMapping
    public String signUp(@ModelAttribute("member") Member member) {

        member.setMemBth(member.getMemBth().substring(5, 7) + member.getMemBth().substring(8, 10));
        memberService.joinMember(member);

        return "/login&join/signUp-success";
    }

    @PostMapping("/kakao")
    @ResponseBody
    public boolean kakao_join(@RequestParam("kakao_name") String kakao_name, @RequestParam("kakao_email")String kakao_email, @RequestParam("kakao_bth")String kakao_bth) {

        boolean isSuccess = true;
        Member member = new Member();

            member.setKakaoYn(true);
            member.setMemEmail(kakao_email);
            member.setMemName(kakao_name);
            member.setMemBth(kakao_bth);

            if(!memberService.existingMember(member)){
                //이미 존재하는 회원일 경우
                isSuccess = false;

            } else {
                memberService.joinMember(member);
            }

            return isSuccess;
    }


}
