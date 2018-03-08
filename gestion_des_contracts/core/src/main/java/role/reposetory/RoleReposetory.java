package role.reposetory;

import business.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReposetory extends JpaRepository<Role,Integer> {
}


