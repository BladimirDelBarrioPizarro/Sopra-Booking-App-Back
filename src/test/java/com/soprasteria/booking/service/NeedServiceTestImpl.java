package com.soprasteria.booking.service;

import com.soprasteria.booking.service.impl.NeedServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NeedServiceTestImpl {

    private NeedService needService = Mockito.mock(NeedService.class);
    private NeedServiceImpl needServiceImpl = Mockito.mock(NeedServiceImpl.class);
}
