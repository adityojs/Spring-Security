package com.adityo.springsecurity;

import java.io.PrintWriter;
import java.util.List;

import com.adityo.springsecurity.Recruitment;

public interface CsvService {

    public void downloadCsvFile(PrintWriter printWriter, List<Recruitment> recruitment);
}
