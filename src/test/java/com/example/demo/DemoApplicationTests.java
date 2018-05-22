package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

/* commenting because of entity manager */

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = DemoRepository.class)
@TestPropertySource(properties = { "spring.datasource.url=jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
"spring.datasource.driverClassName=org.h2.Driver", "spring.datasource.username=sa", "spring.datasource.password=sa", "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect"})
@SpringBootTest
//@SpringBootTest(classes = DemoRepository.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@Transactional
public class DemoApplicationTests {

	/*@Autowired
	private DemoRepository demoRepository;
	
	@PersistenceContext
	private EntityManager entityManager;*/
	
	@Test
	public void contextLoads() {
	}

}
