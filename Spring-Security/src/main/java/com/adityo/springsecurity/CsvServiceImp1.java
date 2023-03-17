package com.adityo.springsecurity;

import java.io.PrintWriter;
import java.util.List;

import com.adityo.springsecurity.CsvService;
import com.adityo.springsecurity.Recruitment;
import org.springframework.stereotype.Service;

@Service

public class CsvServiceImp1 implements CsvService{
    @Override
    public void downloadCsvFile(PrintWriter printWriter, List<Recruitment> recruitment1) {
            printWriter.write("Id, Name, Salary, Email\n");
            for (Recruitment recruitment :recruitment1) {
                printWriter.write(recruitment.getId() + "," + recruitment.getName() + "," + recruitment.getSalary() + "," + recruitment.getEmail() + "\n");
            }
    }
}
