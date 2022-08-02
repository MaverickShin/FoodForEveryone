package food.domain.member;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="members")
@NoArgsConstructor
@Getter
public class MemberEntity {

    @Id
    private String memberId;

    @NotNull
    private String memberName;

    @NotNull
    private String memberPassword;

    @NotNull
    private String memberEmail;

    private String img_path;

    @Builder
    public MemberEntity(String memberId, String memberName, String memberPassword, String memberEmail, String img_path) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPassword = memberPassword;
        this.memberEmail = memberEmail;
        this.img_path = img_path;
    }
}
