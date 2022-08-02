package food.service.member.Implements;

import food.domain.member.MemberEntity;
import food.dto.member.MemberDTO;
import food.repository.member.MemberRepository;
import food.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    /**
     * 멤버 등록
     * @param memberDTO
     */
    @Override
    public void joinMember(MemberDTO memberDTO) {
        // toEntity() 메소드로 MemberEntity에 값 전달
        MemberEntity memberEntity = memberDTO.toEntity();
        memberRepository.save(memberEntity);
    }

    /**
     * 멤버 조회
     * @param memberId
     * @return
     */
    @Override
    public MemberDTO findMember(String memberId) {
        return null;
    }

    @Override
    public void deleteMember(String memberId) {

    }

    @Override
    public void vailidateMember(String memberId) {

    }
}
