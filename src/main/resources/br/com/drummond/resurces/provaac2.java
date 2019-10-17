package br.com.drummond.resurces;

public class provaac2 {

	
	package br.com.drummond;

		
		import org.springframework.http.ResponseEntity;
		import org.springframework.web.bind.annotation.PathVariable;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RequestMethod;
		import org.springframework.web.bind.annotation.RestController;

		@RestController
		public class provaac2 {

			@RequestMapping(value = { "/soma/{numero1}/{numero2}/{numero3}","/" , "/health"} , method = RequestMethod.GET)
			public Integer somar(@PathVariable Integer numero1, @PathVariable Integer numero2 , @PathVarible Integer numero3) {
				Integer retonar o maior;
				resultado = numero1 + numero2 + numero3;
				
				return retornar o maior;
			}
			
		}



	}

}
