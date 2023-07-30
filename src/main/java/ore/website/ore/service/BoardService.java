package ore.website.ore.service;


import ore.website.ore.model.Notice;
import ore.website.ore.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

@Service
public class BoardService {
    @Autowired
    private NoticeRepository noticeRepository;

    @Transactional
    public void createBoard(Notice notice) {
        noticeRepository.save(notice);
    }

    public Notice findByNoticeNo(Long noticeNo) {

        return noticeRepository.getById(noticeNo);
    }



}
