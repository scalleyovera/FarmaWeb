package com.ciberfarma.services;

import java.util.Collections;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ciberfarma.model.RoleList;
import com.ciberfarma.model.Usuario;
import com.ciberfarma.repository.IUsuarioRepository;

@Service
@NoArgsConstructor
public class UserService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByCorreo(correo)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + correo));

       
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(RoleList.ROLE_USER.name());

        return new org.springframework.security.core.userdetails.User(
                usuario.getCorreo(),
                usuario.getClave(),
                Collections.singleton(authority)
        );
    }
}
