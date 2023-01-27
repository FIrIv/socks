package pro.sky.socks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.socks.model.Socks;
import java.util.Optional;

public interface SocksRepository extends JpaRepository<Socks, Integer> {
}
