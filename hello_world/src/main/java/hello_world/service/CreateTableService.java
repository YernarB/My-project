package hello_world.service;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello_world.dao.ContentDao;

@Service
public class CreateTableService {

  @Autowired
  private ContentDao contentDao;

  @PostConstruct
  public void initDb() throws Exception {
    contentDao.runCreateTableSql(sql("createContentTable"));
    contentDao.runCreateTableSql(sql("insertContent"));
  }


  private final String sql(String name) throws Exception {
    Scanner scanner = new Scanner(this.getClass().getResourceAsStream(name + ".sql"));
    String text = scanner.useDelimiter("\\A").next();
    scanner.close();
    return text;
  }



}
