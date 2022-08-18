package fcmb.com.good.repo;

import fcmb.com.good.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByEmail(String email);

    Optional<User> findById(User any);


}
