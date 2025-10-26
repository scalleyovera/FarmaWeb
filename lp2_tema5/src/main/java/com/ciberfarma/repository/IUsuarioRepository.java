package com.ciberfarma.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciberfarma.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	//select * from tb_usuarios where usr_usua = ? and cla_usua=?
	//QueryMethod
	//List<Usuario> findByApe_usua(String ape_usua);
	Usuario findByCorreoAndClave(String correo, String clave);
	
	Optional<Usuario>findByCorreo(String correo);
	
}
