package nana.TrialTrove.repository;

import nana.TrialTrove.domain.ApplicationEntity;
import nana.TrialTrove.domain.MemberEntity;
import nana.TrialTrove.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Long> {
    Optional<ApplicationEntity> findByProductAndMember(ProductEntity product, MemberEntity member);

}
