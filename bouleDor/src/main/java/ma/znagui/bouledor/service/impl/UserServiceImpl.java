package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.entity.AppUser;
import ma.znagui.bouledor.repository.UserRepository;
import ma.znagui.bouledor.service.UserService;
import org.springframework.stereotype.Service;  

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public AppUser addNewUser(AppUser user) {
        return userRepository.save(user);
    }
}
