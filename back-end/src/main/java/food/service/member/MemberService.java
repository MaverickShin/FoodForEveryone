package food.service.member;

import food.dto.member.MemberDTO;

public interface MemberService {

    void joinMember(MemberDTO memberDTO); // CREATE 멤버 등록
    MemberDTO findMember(String memberId); // READ 멤버 조회
    void deleteMember(String memberId); // DELETE 멤버 탈퇴
    void vailidateMember(String memberId); // 메버가 있는지 검증

}
