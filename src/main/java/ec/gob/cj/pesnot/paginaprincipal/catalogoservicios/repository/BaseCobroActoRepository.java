package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.BaseCobroActo;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.Libro;

@Repository
public interface BaseCobroActoRepository extends JpaRepository<BaseCobroActo,Long>{

	@Query(nativeQuery = true,value="SELECT TOP 1 * FROM BASECOBROACTO c WHERE c.NOMBREBASECOBROACTO LIKE :nombre%")
	Optional<BaseCobroActo> getBaseActoByNombre(@Param("nombre") String nombre);

}
