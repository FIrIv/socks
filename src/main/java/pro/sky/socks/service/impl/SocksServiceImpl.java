package pro.sky.socks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.model.Operation;
import pro.sky.socks.service.SocksService;

@RequiredArgsConstructor
@Service
public class SocksServiceImpl implements SocksService {

    @Override
    public SocksDto incomeSocks(SocksDto socks) {
        return null;
    }

    @Override
    public SocksDto outcomeSocks(SocksDto socks) {
        return null;
    }

    @Override
    public SocksDto getSocks(SocksDto socks, Operation operation) {
        return null;
    }
}
