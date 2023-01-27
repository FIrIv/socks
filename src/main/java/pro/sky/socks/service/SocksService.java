package pro.sky.socks.service;

import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.model.Operation;

public interface SocksService {
    SocksDto incomeSocks (SocksDto socks);
    SocksDto outcomeSocks (SocksDto socks);
    SocksDto getSocks (SocksDto socks, Operation operation);
}
