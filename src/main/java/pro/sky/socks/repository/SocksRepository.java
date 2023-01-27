package pro.sky.socks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.socks.model.Socks;

import java.util.List;

public interface SocksRepository extends JpaRepository<Socks, Integer> {
    List<Socks> findAllByColor (String color);
    List<Socks> findAllByColorAndAndCottonPartIsAfter (String color, Integer cottonPart);
    List<Socks> findAllByColorAndAndCottonPartIsBefore (String color, Integer cottonPart);
    List<Socks> findAllByColorAndAndCottonPartEquals (String color, Integer cottonPart);
}