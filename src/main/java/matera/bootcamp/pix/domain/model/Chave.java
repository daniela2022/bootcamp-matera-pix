package matera.bootcamp.pix.domain.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




public class Chave {
	
	//id, Tipo Chave, valor, ContCorrente
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoChave tipoChave;
	
	@Column(nullable = false)
	private String valor;
	
	@ManyToOne(optional = false)
	private ContaCorrente contaCorrente;
	

}
