package at.joma.playground.starter.vuejs;

import at.joma.playground.starter.vuejs.dto.CommentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class CommentController {

    @RequestMapping(value = "/api/comment", method = RequestMethod.POST)
    @ResponseBody
    public CommentDTO add(@Valid @RequestBody CommentDTO comment) {
        return comment;
    }
}
