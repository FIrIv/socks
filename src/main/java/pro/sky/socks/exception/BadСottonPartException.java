package pro.sky.socks.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class BadСottonPartException extends RuntimeException {
    public BadСottonPartException(String message) {
        super(message);
    }
}
