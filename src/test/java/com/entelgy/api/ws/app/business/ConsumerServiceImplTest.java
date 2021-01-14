package com.entelgy.api.ws.app.business;

import com.entelgy.api.ws.app.configuration.ApiConsumer;

import static org.mockito.Mockito.when;

import com.entelgy.api.ws.app.model.CommentsConsumer;
import io.reactivex.Single;
import io.reactivex.observers.TestObserver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ConsumerServiceImplTest {

    @InjectMocks
    private ConsumerServiceImpl consumerServiceImpl;

    @Mock
    private ApiConsumer apiConsumer;
    
    @Mock
    private ConsumerProcessor processor;

    private CommentsConsumer commentsConsumer;
    @Before
    public void update(){
        commentsConsumer = new CommentsConsumer(1,1,"entelgy",
                "entelgy@gmail.com","comments");

    }
    @Test
    public void getApiTestOk(){

        List<CommentsConsumer> comments = Arrays.asList(commentsConsumer);
        
        when(processor.convert(commentsConsumer)).thenReturn("1/1/entelgy@gmail.com");

        when(apiConsumer.getApi()).thenReturn(Single.just(comments));

        TestObserver testObserver = consumerServiceImpl.getApi().test();

        testObserver.assertComplete();
        testObserver.assertNoErrors();
    }

}
