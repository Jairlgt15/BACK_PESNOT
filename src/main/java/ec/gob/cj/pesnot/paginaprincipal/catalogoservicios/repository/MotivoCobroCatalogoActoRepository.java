package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.MotivoCobroCatalogoActo;

@Repository
public interface MotivoCobroCatalogoActoRepository extends JpaRepository <MotivoCobroCatalogoActo,Long> {
	
}
