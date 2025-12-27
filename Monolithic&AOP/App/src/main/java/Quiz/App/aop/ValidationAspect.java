package Quiz.App.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* Quiz.App.service.QuizService.getQuizQuestions(..)) && args(quizId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp,int quizId) throws Throwable {

        if(quizId<0){
            quizId = -quizId;
        }

        Object obj = jp.proceed(new Object[]{quizId});

        return obj;
    }
}
