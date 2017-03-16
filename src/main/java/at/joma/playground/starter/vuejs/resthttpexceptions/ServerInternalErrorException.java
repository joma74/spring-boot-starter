package at.joma.playground.starter.vuejs.resthttpexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerInternalErrorException extends RuntimeException{
}
