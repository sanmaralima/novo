package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Avaliacao;

public interface AvaliacaoRepository extends CrudRepository<Avaliacao, Long>{
    @SuppressWarnings("unchecked")
    Avaliacao save(Avaliacao newAvaliacao);

}