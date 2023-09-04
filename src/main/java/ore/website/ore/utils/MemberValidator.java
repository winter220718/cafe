package ore.website.ore.utils;

import lombok.RequiredArgsConstructor;
import ore.website.ore.model.Member;
import ore.website.ore.service.MemberService;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class MemberValidator implements Validator {

    private final MemberService memberService;


    // Validator가 해당 클래스를 지원하는지 확인하는 메서드
    @Override
    public boolean supports(Class<?> clazz) {
        return Member.class.isAssignableFrom(clazz);
    }

    // 검증 대상 객체와 검증 로직을 수행함
    @Override
    public void validate(Object target, Errors errors) {
    Member member = (Member)target;
    BindingResult bindingResult;

    // 검증 로직
        if(ObjectUtils.isEmpty(member.getMemEmail())) {
            errors.rejectValue("email", "이메일을 입력하세요.");
        }
    }
}
