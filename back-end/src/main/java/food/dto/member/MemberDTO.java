package food.dto.member;

import food.domain.member.MemberEntity;
import lombok.Data;

@Data
public class MemberDTO {

    private String memberId;
    private String memberName;
    private String memberPassword;
    private String memberEmail;
    private String img_path;

    public MemberEntity toEntity() {
        return MemberEntity.builder()
                .memberId(memberId)
                .memberPassword(memberPassword)
                .memberEmail(memberEmail)
                .memberName(memberName)
                .img_path(img_path)
                .build();
    }
}
