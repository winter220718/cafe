package ore.website.ore.service;

import ore.website.ore.model.Notice;
import ore.website.ore.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {
    @Autowired
    private NoticeRepository noticeRepository;

    @Transactional
    public void createBoard(Notice notice) {

        noticeRepository.save(notice);
    }

}
