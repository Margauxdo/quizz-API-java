package m2i.mdcb.quizz.controler;


import m2i.mdcb.quizz.entity.Question;
import m2i.mdcb.quizz.service.QuizzService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/quizz")
public class QuizzControler {
    private final QuizzService quizzService;
    public QuizzControler(QuizzService quizzService) {
        this.quizzService = quizzService;
    }

@GetMapping()
    public ResponseEntity<List<Question>> getQuizzByCategory() {
        return ResponseEntity.ok();
}


}
