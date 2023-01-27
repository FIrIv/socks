package pro.sky.socks.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class cottonPartException extends RuntimeException {
    public cottonPartException(String message) {
        super(message);
    }
}
