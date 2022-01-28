package com.revature.service;


import com.revature.repos.CommonDAO;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CommonServiceTest {

    private CommonService commonService;

    @Mock
    private CommonDAO dao;


    @BeforeEach
    public void setUp() {
        dao = Mockito.mock(CommonDAO.class);
        commonService = new CommonService(dao);
    }


}
