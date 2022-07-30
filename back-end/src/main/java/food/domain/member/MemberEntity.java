package food.domain.member;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MemberEntity {

    @Id
    private String memberId;
    private String memberPassword;
    private String memberPhone;
    private String memberSex;
}
