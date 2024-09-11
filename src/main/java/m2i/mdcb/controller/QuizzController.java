package m2i.mdcb.controller;

import m2i.mdcb.entity.Quizz;
import m2i.mdcb.service.QuizzService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/quizz")
public class QuizzController {

    private final QuizzService quizzService;

    public QuizzController(QuizzService quizzService) {
        this.quizzService = quizzService;
    }

    @GetMapping("/{idCategory}")
    public ResponseEntity<Quizz> getQuizzByCategory(@PathVariable Integer idCategory) {

        Quizz quizz = quizzService.createQuizzByCategory(idCategory);

        return ResponseEntity.ok(quizz);
    }


}
