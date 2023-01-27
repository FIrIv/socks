package pro.sky.socks.mapper;

import org.mapstruct.Mapper;
import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.model.Socks;

@Mapper(componentModel = "spring")
public interface SocksMapper {

    Socks toEntity(SocksDto socks);

    SocksDto toDto(Socks socks);
}
