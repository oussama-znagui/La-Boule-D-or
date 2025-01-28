package ma.znagui.bouledor.service;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.auth.LoginRequestDTO;
import ma.znagui.bouledor.dto.auth.LoginResponseDTO;
import ma.znagui.bouledor.entity.AppUser;
import ma.znagui.bouledor.repository.UserRepository;
import ma.znagui.bouledor.service.security.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    public LoginResponseDTO authenticate(LoginRequestDTO dto){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getEmail(),
                        dto.getPassword()
                )
        );

        AppUser user =  userRepository.findByEmail(dto.getEmail())
                .orElseThrow();

        String jwtToken = jwtService.generateToken(user);

        return new LoginResponseDTO(jwtToken, jwtService.getExpirationTime(), user.getAuthorities().toString());

    }



}
