package ma.znagui.bouledor.service;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustumUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return repository.findByUsername(email).orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

    }
}
