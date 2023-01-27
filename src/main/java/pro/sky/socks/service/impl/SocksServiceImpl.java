package pro.sky.socks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.mapper.SocksMapper;
import pro.sky.socks.model.Socks;
import pro.sky.socks.repository.SocksRepository;
import pro.sky.socks.service.SocksService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SocksServiceImpl implements SocksService {

    private final SocksMapper socksMapper;
    private final SocksRepository socksRepository;

    @Override
    public SocksDto incomeSocks(SocksDto socks) {
        Socks input = socksMapper.toEntity(socks);
        input.setId(null);
        return socksMapper.toDto(socksRepository.save(input));
    }

    @Override
    public List<SocksDto> outcomeSocks(SocksDto socks) {
        return socksMapper.toDtos(socksRepository.findAllByColor(socks.getColor()));
    }

    @Override
    public List<SocksDto> getSocks(String color, String operation, Integer cottonPart) {
        List<Socks> tempList = new ArrayList<>();
        switch (operation) {
            case "moreThen":
                tempList = socksRepository.findAllByColorAndAndCottonPartIsAfter(color, cottonPart);
                break;
            case "lessThen":
                tempList = socksRepository.findAllByColorAndAndCottonPartIsBefore(color, cottonPart);
                break;
            case "equal":
                tempList = socksRepository.findAllByColorAndAndCottonPartEquals(color, cottonPart);
                break;
        }
        return socksMapper.toDtos(tempList);
    }
}
