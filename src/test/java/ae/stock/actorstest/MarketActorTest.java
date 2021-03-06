package ae.stock.actorstest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull; 

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.ofallonfamily.jersey2akka.AfterEffectsApplication;

public class MarketActorTest extends JerseyTest{
	

protected Application configure() {
        return new AfterEffectsApplication();
    }
	
	protected void configureClient(ClientConfig clientConfig) {
        clientConfig.register(new JacksonJsonProvider());
    }
	
	@Test
    public void testMarket() {
		Response response = target("/game/init").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return true or false", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/game/companies").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return company list", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/player-broker/addplayer/abc").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return boolean", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/player-broker/player-info/abc").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return player info", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  
		  response = target("/game/ai-players").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return ai player list", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/game/company-trends").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return stock values for rounds", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/player-broker/stocktransactions/abc").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return stock transactions list", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
		  
		  response = target("/analyst/stocks").request().get();
		  assertEquals("should return status 200", 200, response.getStatus());
		  assertNotNull("Should return analyses", response.getEntity().toString());
		  System.out.println(response.getStatus());
		  System.out.println(response.readEntity(String.class));
    }
	


}
