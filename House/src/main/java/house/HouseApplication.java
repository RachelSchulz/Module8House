package house;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import controller.BeanConfiguration;
import house.beans.House;
import house.repository.IHouseRepository;


@SpringBootApplication
public class HouseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HouseApplication.class, args);
	}
	
	@Autowired
	IHouseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = new House();
		h.setAddress("123 Main St");
		h.setCity("Fort Dodge");
		h.setState("IA");
		h.setNumBedroom(2);
		h.setNumBath(1);
		repo.save(h);
		
		House a = new House("1420 8th Ave", "Ames", "IA", 4, 2);
		repo.save(a);
		
		List<House> allHouses = repo.findAll();
		
		for (House house : allHouses) {
			System.out.println(house);
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	

		
	
}
