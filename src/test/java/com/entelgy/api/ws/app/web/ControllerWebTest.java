package com.entelgy.api.ws.app.web;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.entelgy.api.ws.app.business.ConsumerService;
import com.entelgy.api.ws.app.model.response.CommentsResponse;

import io.reactivex.Single;
import io.reactivex.observers.TestObserver;

@RunWith(MockitoJUnitRunner.class)
public class ControllerWebTest {

    @InjectMocks
    private ControllerWeb controllerWeb;

    @Mock
    private ConsumerService consumerService;

    @Test
    public void consumerTest(){
        
    	when(consumerService.getApi()).thenReturn(Single.just(new CommentsResponse()));

        TestObserver<CommentsResponse> testObserver = controllerWeb.consumer().test();

        testObserver.assertNoErrors();
    }
}
