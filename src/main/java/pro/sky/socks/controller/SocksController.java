package pro.sky.socks.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.socks.dto.SocksDto;
import pro.sky.socks.exception.OperationNotFoundException;
import pro.sky.socks.exception.BadСottonPartException;
import pro.sky.socks.service.SocksService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/socks")
public class SocksController {

    private final SocksService socksService;
    @PostMapping("/income")
    public ResponseEntity<SocksDto> incomeSocks(SocksDto socks) {
        if (socks.getCottonPart()<0 || socks.getCottonPart()>100) {
            throw new BadСottonPartException("Неверно указан % хлопка в составе (должен быть от 0 до 100%). ");
        }
        return ResponseEntity.ok(socksService.incomeSocks(socks));
    }

    @PostMapping("/outcome")
    public ResponseEntity<List<SocksDto>> outcomeSocks(SocksDto socks) {
        return ResponseEntity.ok(socksService.outcomeSocks(socks));
    }

    @GetMapping
    public ResponseEntity<List<SocksDto>> getSocks(@RequestParam String color,
                                             @RequestParam String operation,
                                             @RequestParam Integer cottonPart) {
        if (!operation.equals("moreThen") || !operation.equals("lessThen") || !operation.equals("equal")) {
            throw new OperationNotFoundException("Неверный параметр запроса. ");
        }
        return ResponseEntity.ok(socksService.getSocks(color, operation, cottonPart));
    }
}
