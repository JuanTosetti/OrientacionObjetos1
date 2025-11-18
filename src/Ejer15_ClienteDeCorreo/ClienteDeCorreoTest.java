package Ejer15_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	
	
	//caso normal: Verifica que al recibir un Email, se almacena en la carpeta inbox 
	//cliente con una sola carpeta 
	@Test 
	void testRecibirColocaEnInbox() {
		//Arrange
		ClienteDeCorreo cliente = new ClienteDeCorreo("Juan", "Juan@email.com");
		Carpeta inbox = new Carpeta("inbox");
		Email email = new Email("Mensaje", "Hola amigos!");
		
		//act
		cliente.agregarCarpeta(inbox);
		cliente.recibir(email);

		
		//assert
		assertTrue(inbox.getEmails().contains(email));
	}
	
	//caso borde: el cliente no tiene carpetas creadas
	//se verfica que recibir un email no cause errores ni agregue emails
	@Test
	void testRecibirSinCarpetas() {
		//Arrange
		ClienteDeCorreo cliente = new ClienteDeCorreo("Juan", "Juan@email.com");
		Email email = new Email("Mensaje", "Hola amigos!");
		//act
		cliente.recibir(email);
		//assert
		//como no hay carpetas,	no deberia agregarse ningun email
		assertTrue(cliente.getCarpetas().isEmpty());
	}

	//caso borde: el cliente recibe un email nulo
	//se deberia ignorar el mensaje
	@Test
	void testRecibirEmailNulo(){
		//Arrange
		ClienteDeCorreo cliente = new ClienteDeCorreo("Juan", "Juan@gmail.com");
		Carpeta inbox = new Carpeta("Inbox");
		
		//act
		cliente.agregarCarpeta(inbox);
		cliente.recibir(null);
		
		//assert
		//no deberia haberse agregado nada a las carpeta "inbox"
		assertTrue(inbox.getEmails().isEmpty());
	}
	
	// -----------------------------------------------------------------------
	
	//caso normal: existen tanto el email como la carpeta destin
	@Test
	void testMoverEmailExistente() {
		//arrange
		ClienteDeCorreo cliente = new ClienteDeCorreo("Juan", "Juan@email.com");
		Carpeta inbox = new Carpeta("inbox");
		Carpeta basura = new Carpeta("basura");
		Email email = new Email("Mensaje", "Hols amigos!");
		
		//act
		cliente.agregarCarpeta(inbox);
		cliente.agregarCarpeta(basura);
		cliente.recibir(email);
		inbox.mover(cliente, email, basura);
		
		//assert
		
		//devuelve false si "inbox" contiene el mail movido (puede contener otros)
		//y devuelve true si "basura" contiene el email
		assertFalse(inbox.getEmails().contains(email));
		assertTrue(basura.getEmails().contains(email));
		
	}
	
	//caso borde:no existe la carpeta destino
	@Test
	void testMoverSinCarpetaDestino() {
		ClienteDeCorreo cliente = new ClienteDeCorreo("Juan", "Juan@email.com");
		Carpeta inbox = new Carpeta("inbox");
		Carpeta spam = new Carpeta("spam");
		Email email = new Email("Mensaje", "Hols amigos!");
		
		cliente.agregarCarpeta(inbox);
		cliente.recibir(email);
		
		//act
		inbox.mover(cliente, email, spam);
		
		//assert
		//se verifica que el email no enctro la carpeta destino
		//y no se movio de su lugar
		assertFalse(cliente.getCarpetas().contains(spam));
		assertTrue(cliente.getCarpetas().contains(inbox));
		assertTrue(inbox.getEmails().contains(email));
	}
	
}
