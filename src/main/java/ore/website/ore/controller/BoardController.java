package ore.website.ore.controller;

import ore.website.ore.model.Member;
import ore.website.ore.model.Notice;
import ore.website.ore.repository.MemberRepository;
import ore.website.ore.repository.NoticeRepository;
import ore.website.ore.service.BoardService;
import ore.website.ore.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
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
    @Transactional
    @GetMapping("/notice/contents")
    public String byNotice(Model model, @RequestParam("no") Long noticeNo) {
        // 조회수 증가
        noticeRepository.addHit(noticeNo);

        Pagination pagination = new Pagination((int)Math.ceil((double)(noticeRepository.getCount()-noticeNo.intValue())/5), noticeRepository.getCount());

        model.addAttribute("content", boardService.findByNoticeNo(noticeNo));
        model.addAttribute("pageNo", Math.max(1, pagination.getPageNo()));
        return "/notice/contents";

    }
    @RequestMapping("/notice")
    public String list(Model model, @RequestParam(value="page", defaultValue ="1", required=false)int pageNo) {
        Pagination pagination = new Pagination(pageNo, noticeRepository.getCount());

        model.addAttribute("notice", noticeRepository.getPageList(pagination.getStartNo(), pagination.getEndNo()));
        model.addAttribute("startPage", pagination.getStartPage());
        model.addAttribute("endPage", pagination.getEndPage());
        model.addAttribute("pageNo", pagination.getPageNo());
        model.addAttribute("totalPage", pagination.getTotalPage());

        return "/notice/notice";


    }

}
