package matera.bootcamp.pix.rest.usuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import matera.bootcamp.pix.domain.model.Usuario;

@RestController
public class UsuarioCrudApiController {
	
	@PostMapping("/api/v1/usuario")
	public Usuario salvar() {
		return null;
	}

}
