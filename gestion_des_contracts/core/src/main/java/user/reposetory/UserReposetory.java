package user.reposetory;

import business.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserReposetory extends JpaRepository<User,Integer> {
}


