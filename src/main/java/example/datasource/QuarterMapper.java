package example.datasource;

import example.model.Quarter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by haljik on 2014/10/03.
 */
public interface QuarterMapper {

    @Select("select * from quarters")
    List<Quarter> findAll();

    @Insert("insert into quarters(fiscal_year, quarter, created_at) " +
            "values (#{quarter.fiscalYear},#{quarter.quarter},#{quarter.createdAt})")
    void register(@Param("quarter") Quarter quarter);
}
