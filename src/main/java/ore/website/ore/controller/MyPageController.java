package ore.website.ore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("myPage")
public class MyPageController {

    @GetMapping
    public String myPage() {

        return "/mypage/myPage";

    }

}
