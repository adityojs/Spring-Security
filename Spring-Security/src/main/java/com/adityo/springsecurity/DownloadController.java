package com.adityo.springsecurity;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DownloadController {
    @Autowired
    private CsvService csvService;

    @RequestMapping ("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/download/recruitment.csv")
    public void downloadCsvFile(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file-recruitment.csv");
        csvService.downloadCsvFile(response.getWriter(), createDataTest()) ;
    }

    private List<Recruitment> createDataTest() {
        List<Recruitment> data = new ArrayList<>();
        data.add(new Recruitment(1, "Jaya", 45000, "jaya@gmail.com"));
        data.add(new Recruitment(2, "Subakti", 55000, "subakti@gmail.com"));
        data.add(new Recruitment(3, "Raden", 65000, "raden@gmail.com"));
        return data;

    }
}
