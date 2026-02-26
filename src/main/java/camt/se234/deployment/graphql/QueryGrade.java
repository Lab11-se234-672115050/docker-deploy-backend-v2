package camt.se234.deployment.graphql;

import camt.se234.deployment.entity.Grade;
import camt.se234.deployment.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QueryGrade {
    @Autowired
    GradeService gradeService;

    @QueryMapping
    public Grade getGradeFromScore(@Argument double score) {
        return Grade.builder().grade(gradeService.getGrade(score)).build();
    }
}
