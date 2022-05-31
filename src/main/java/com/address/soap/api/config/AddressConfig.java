package com.address.soap.api.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class AddressConfig {

	  @Bean
	  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) 
	  {
	    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	    servlet.setApplicationContext(applicationContext);
	    servlet.setTransformWsdlLocations(true);
	    return new ServletRegistrationBean(servlet, "/address/*");
	  }
	  
	  
	  @Bean(name = "addressAvailability")
	  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) 
	  {
	    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
	    wsdl11Definition.setPortTypeName("Address");
	    wsdl11Definition.setLocationUri("/address");
	    wsdl11Definition.setTargetNamespace("http://www.api.soap.address.com/model");
	    wsdl11Definition.setSchema(countriesSchema);
	    return wsdl11Definition;
	  }
	  
	  @Bean
	  public XsdSchema countriesSchema() 
	  {
	    return new SimpleXsdSchema(new ClassPathResource("address.xsd"));
	  }
}
