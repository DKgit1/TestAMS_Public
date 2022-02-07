package come.demoSpringProject;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.demoSpringProject_Cucumber.Beans.Country;
import com.demoSpringProject_Cucumber.Services.CountryService;

@SpringBootTest(classes= {ServiceMockitoTests.class})
public class ServiceMockitoTests {
	
	@InjectMocks
	CountryService countryService;
	
	@Test
	public void test_getAllCountries()
	{
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"India","Delhi"));
		mycountries.add(new Country(2,"USA","Washington"));
		mycountries.add(new Country(3,"UK","London"));
		//int countryID=1;
		Assertions.assertEquals(mycountries.size(),countryService.getAllCounties().size());
	}
	
	@Test
	public void test_getCountrybyID()
	{
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"India","Delhi"));
		mycountries.add(new Country(2,"USA","Washington"));
		mycountries.add(new Country(3,"UK","London"));
		int countryID=1;
		Assertions.assertEquals(countryID,countryService.getCountrybyID(countryID).getId());
	}
	
	@Test
	public void test_getCountrybyName()
	{
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"India","Delhi"));
		mycountries.add(new Country(2,"USA","Washington"));
		mycountries.add(new Country(3,"UK","London"));
		int countryID=2 ;
		Assertions.assertEquals(countryID,countryService.getCountrybyName("USA").getId());
	}
	
	

}
