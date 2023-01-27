package pro.sky.socks.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.exception.cottonPartException;
import pro.sky.socks.model.Operation;
import pro.sky.socks.service.SocksService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/socks")
public class SocksController {

    private final SocksService socksService;
    @PostMapping("/income")
    public ResponseEntity<SocksDto> incomeSocks(SocksDto socks) {
        if (socks.getCottonPart()<0 || socks.getCottonPart()>100) {
            throw new cottonPartException("Неверно указан % хлопка в составе (должен быть от 0 до 100%). ");
        }
        return ResponseEntity.ok(socksService.incomeSocks(socks));
    }

    @PostMapping("/outcome")
    public ResponseEntity<SocksDto> outcomeSocks(SocksDto socks) {
        return ResponseEntity.ok(socksService.outcomeSocks(socks));
    }

    @GetMapping
    public ResponseEntity<SocksDto> getSocks(SocksDto socks, Operation operation) {
        return ResponseEntity.ok(socksService.getSocks(socks, operation));
    }
}
