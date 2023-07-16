package ore.website.ore.controller;

import ore.website.ore.model.Member;
import ore.website.ore.model.Notice;
import ore.website.ore.repository.MemberRepository;
import ore.website.ore.repository.NoticeRepository;
import ore.website.ore.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private MemberRepository memberRepository;
    @GetMapping("/notice")
    public String notice(Model model) {

        List<Notice> notice = noticeRepository.findAll(Sort.by(Sort.Direction.DESC, "noticeNo"));

        model.addAttribute("notice", notice);


        return "/notice/notice";
    }


    @GetMapping("/notice/no")
    public String byMenuCtgNo(Model model, @RequestParam("no") Long noticeNo) {


        return "/notice/contents";
    }


}
