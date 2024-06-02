package nana.TrialTrove.domain;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class ProductDTO {

    private Long id;
    private String productName;
    private String image;       // 이미지 경로
    private String sellerName;
    private String location;
    private LocalDate deadlineDate;
    private int applicants;
    private int maxApplicants;
    private MemberEntity ownerId; // MemberEntity의 id를 참조
    private Long categoryId; // Category의 id를 참조
    private String description;
    private String activityType;
    private String categoryName; // Category의 name 참조

    private MultipartFile imageFile; // 업로드된 이미지 파일

    // 체험 목록
    public ProductDTO(String productName, String image, String location, int maxApplicants, String activityType, String categoryName) {
        this.productName = productName;
        this.image = image;
        this.location = location;
        this.maxApplicants = maxApplicants;
        this.activityType = activityType;
        this.categoryName = categoryName;
    }
}
