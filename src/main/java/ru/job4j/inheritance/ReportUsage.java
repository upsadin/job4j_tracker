package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textreport = new TextReport();
        String text = textreport.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport htmlreport = new HtmlReport();
        System.out.println(htmlreport.generate("Report's name", "Report's body"));
    }
}
