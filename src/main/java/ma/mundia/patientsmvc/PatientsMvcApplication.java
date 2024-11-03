package ma.mundia.patientsmvc;

import ma.mundia.patientsmvc.entities.Patient;
import ma.mundia.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientsMvcApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
		return args -> {
			patientRepository.save(
					new Patient(null, "islam",new Date(),false,12));
			patientRepository.save(
					new Patient(null, "salma",new Date(),false,321));
			patientRepository.save(
					new Patient(null, "sara",new Date(),false,65));
			patientRepository.save(
					new Patient(null, "meriem",new Date(),false,32));
			patientRepository.findAll().forEach(p->{
				System.out.println(p.getNom());
			});
		};
	}
}