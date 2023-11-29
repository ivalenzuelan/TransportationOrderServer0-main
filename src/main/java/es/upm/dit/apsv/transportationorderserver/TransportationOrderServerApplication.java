package es.upm.dit.apsv.transportationorderserver;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import es.upm.dit.apsv.transportationorderserver.repository.TransportationOrderRepository;


@SpringBootApplication
public class TransportationOrderServerApplication {

	public static final Logger log = LoggerFactory.getLogger(TransportationOrderServerApplication.class);
	private TransportationOrderRepository torderRepository
	;
	public static void main(String[] args) {
		SpringApplication.run(TransportationOrderServerApplication.class, args);
	}

}
