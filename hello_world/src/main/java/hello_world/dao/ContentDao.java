package hello_world.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ContentDao {


  @Select("select contenttext from content where ROWID=1")
  String getContent();


  @Insert("${sql}")
  void runCreateTableSql(@Param("sql") String sql);

}
