package Quiz.App.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class-name.method-name(args)

    @Before("execution(* Quiz.App.service.QuestionService.getAllQuestions(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution(* Quiz.App.service.QuestionService.getAllQuestions(..))") //Called after the ended
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* Quiz.App.service.QuestionService.getAllQuestions(..))") //Called it if error throw
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method have a some issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* Quiz.App.service.QuestionService.getAllQuestions(..))")  //Called it if error not throw
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Successfully " + jp.getSignature().getName());
    }
}
