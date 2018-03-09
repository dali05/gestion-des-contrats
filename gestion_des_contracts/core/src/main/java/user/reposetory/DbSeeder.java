package user.reposetory;

import business.entity.Role;
import business.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import role.reposetory.RoleReposetory;

@Component
public class DbSeeder implements CommandLineRunner {
    @Autowired
    private UserReposetory userReposetory;
    @Autowired
    private RoleReposetory roleReposetory;

    @Override
    public void run(String... args) throws Exception {
        Role r1 = new Role("ADMIN");
        User u1 = new User("admin","admin",true,r1);
        this.roleReposetory.save(r1);
        this.userReposetory.save(u1);
    }
}
