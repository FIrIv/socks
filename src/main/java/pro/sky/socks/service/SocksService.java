package pro.sky.socks.service;

import pro.sky.socks.dto.SocksDto;

import java.util.List;

public interface SocksService {
    SocksDto incomeSocks (SocksDto socks);
    List<SocksDto> outcomeSocks (SocksDto socks);
    List<SocksDto> getSocks (String color, String operation, Integer cottonPart);
}
