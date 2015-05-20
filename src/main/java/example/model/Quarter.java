package example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by haljik on 2014/10/03.
 */
public class Quarter {

    private String fiscalYear;
    private String quarter;
    private LocalDateTime createdAt;


    public Quarter(String fiscalYear, String quarter) {
        this.fiscalYear = fiscalYear;
        this.quarter = quarter;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getAsText() {
        return String.format("%s-%s",fiscalYear,quarter);
    }

    public String getCreatedAtAsText() {
        return createdAt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
