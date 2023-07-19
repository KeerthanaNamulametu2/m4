package com.company;


import com.company.clip05.SalesDataService;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        SalesDataService service = new SalesDataService();
        List list = service.processData("C:\\Users\\keerthana_careeco\\Downloads\\java-fundamentals-exception-handling\\05-working-with-exceptions\\working-with-exceptions-exercise-files\\m4\\file.txt");
        System.out.println(list);
    }
}