package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

  @Autowired
  private DemoRepository demoRepository;
  
  List<DemoDTO> demos = new ArrayList();
  
  
  public void addDemo(DemoDTO demoDTO1) {
	  
	  DemoDTO demoDTO = new DemoDTO();
	  demoDTO.setName("sdfasdfsdf");
	  demoRepository.save(demoDTO);
  }
  
  public List<DemoDTO> getAllDemo(){
	  List<DemoDTO> demoes = new ArrayList();
	  demoRepository.findAll().forEach(demoes::add);
	  return demoes;
  }
  /*
  public void createEntityManagerFactory() {
	  
	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistenceUnit");
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  Query query = entityManager.createQuery("queryString");
  }*/
}
