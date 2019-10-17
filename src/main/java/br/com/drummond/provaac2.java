package br.com.drummond;

	

	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class provaac2 {

		@RequestMapping(value = { "/soma/{numero1}/{numero2}/{numero3}","/" , "/health"} , method = RequestMethod.GET)
		public Integer somar(@PathVariable Integer numero1, @PathVariable Integer numero2 , @PathVariable Integer numero3) {
			Integer resultado = numero1;
			
			if (numero2 > resultado)
				resultado = numero2;
			
			if (numero3 > resultado)
				resultado = numero3;
		
			
			return resultado;
		}
		
	}

