package food.api.member;

import food.dto.member.MemberDTO;
import food.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

// 멤버 컨트롤러
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    /**
     * 멤버 등록
     * @param memberDTO
     * @return
     */
    @PostMapping("/member")
    public ResponseEntity createMember(@RequestBody @Validated MemberDTO memberDTO) {
        memberService.joinMember(memberDTO);
        System.out.println("member : " + memberDTO.toString());
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 멤버 조회
     * @param memberId
     * @return
     */
    @GetMapping("/member/loginCheck/{member-id}")
    public ResponseEntity<MemberDTO> getMember(@PathVariable(value = "member-id") String memberId) {
        return new ResponseEntity(memberService.findMember(memberId), HttpStatus.OK);
    }

    /**
     * 멤버 삭제
     * @param memberId
     * @return
     */
    @GetMapping("/member/removeMember/{member-id}")
    public ResponseEntity removeMember(@PathVariable(value = "member-id") String memberId) {
        memberService.deleteMember(memberId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
