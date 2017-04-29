package hello_world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello_world.dao.ContentDao;

@Service
public class HelloWorldService {

  @Autowired
  private ContentDao contentDao;


  public String getContent() {
    return contentDao.getContent();
  }

}
