package dhbw.eiCompany.repositories;

import dhbw.eiCompany.database.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByTypeId(Long typId);
}
