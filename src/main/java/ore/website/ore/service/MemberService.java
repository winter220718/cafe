package ore.website.ore.service;

import ore.website.ore.model.Member;
import ore.website.ore.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static java.util.Objects.isNull;

@Service
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    private final EntityManager entityManager;


    public MemberService(MemberRepository memberRepository, EntityManager entityManager) {
        this.memberRepository = memberRepository;
        this.entityManager = entityManager;
    }

    @Transactional
    public void joinMember(Member member) {

        memberRepository.save(member);
    }

    public boolean existingMember(Member member) {
        Member existingMember = memberRepository.findByMemEmail(member.getMemEmail());
        if (!isNull(existingMember)) {
            //이미 존재하는 회원인 경우
            return false;
        }
        return true;
    }
}
