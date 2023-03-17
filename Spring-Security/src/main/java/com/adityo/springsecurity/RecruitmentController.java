package com.adityo.springsecurity;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RecruitmentController {

    @GetMapping("/api/recruitment/positions.json")
    public Recruitment getRecruitment() {
        return  new Recruitment(101,"Adityo",1500000,"adityo@gmail.com");
    }

    @GetMapping("/api/recruitment/positions/{ID}")
    public List<Recruitment> getEmpList() {
        List<Recruitment> emplist = new ArrayList<>();
        emplist.add(new Recruitment(101, "Jaya", 45000, "jaya@gmail.com"));
        emplist.add(new Recruitment(102, "Subakti", 55000, "subakti@gmail.com"));
        emplist.add(new Recruitment(103, "Raden", 65000, "raden@gmail.com"));

        return emplist;
    }

}
