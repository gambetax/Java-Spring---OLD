package javaSpring.com.verano;

import com.bolivarsoft.sensorclima.*;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeranoApplication {

	public static void main(String[] args) {
                
                //pruebaSensor();
                
		SpringApplication.run(VeranoApplication.class, args);
                
	}

}
