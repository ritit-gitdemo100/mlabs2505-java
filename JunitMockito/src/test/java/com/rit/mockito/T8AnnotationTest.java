package com.rit.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//Use MockitoExtension to automatically initialize mocks
@ExtendWith(MockitoExtension.class) 
class T8AnnotationTest {

	@Mock
	private MyRepository myRepository; 

	@InjectMocks
	private MyService myService; 

	@Test
	void testGetData() {
		when(myRepository.getData()).thenReturn("Mocked Data");
		String result = myService.getData();
		assertEquals("Mocked Data", result);
	}
}

class MyRepository {
	public String getData() {
		return "Real Data";
	}
}

class MyService {
	private final MyRepository myRepository;

	public MyService(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	public String getData() {
		return myRepository.getData();
	}
}
