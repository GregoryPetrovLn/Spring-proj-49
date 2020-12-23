package telran.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controller for performing REST API upon HTTP protocol
public class SpringProj49Controller {

    @GetMapping("calculator/add")
    int sum(int op1, int op2) {
        return op1 + op2;
    }

    @GetMapping("calculator/subtract")
    int subtract(int op1, int op2) {
        return op1 - op2;
    }

    @GetMapping("calculator/divide")
    int div(int op1, int op2) {
        return op1 / op2;
    }

    @GetMapping("calculator/multiply")
    int multiply(int op1, int op2) {
        return op1 * op2;
    }

}
