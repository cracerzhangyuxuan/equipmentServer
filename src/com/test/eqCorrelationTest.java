package com.test;

import com.bean.EqCorrelation;
import com.bean.EqCorrelationExample;
import com.service.EqCorrelationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class eqCorrelationTest {

    @Autowired
    private EqCorrelationService EqCorrelationService;

    @Test
    public void insertSelectiveTest(){
        EqCorrelationExample EqCorrelationExample1=new EqCorrelationExample();

        EqCorrelationExample1.or().andEqCoIdIsNotNull();
        long count=EqCorrelationService.countByExample(EqCorrelationExample1);
        EqCorrelation record=new EqCorrelation();
        if(count==0){
            record.setEqCoId(1);
        }

        record.setEqChildId(3);
        record.setEqParentId(3);
        EqCorrelationService.insertSelective(record);
        System.out.println(count);
        System.out.println("success1");
    }

    @Test
    public void deleteByPrimaryKeyTest(){

        Integer eqid=2;
        EqCorrelation EqCorrelation=EqCorrelationService.selectByPrimaryKey(eqid);
        if(EqCorrelation!=null) {
            EqCorrelationService.deleteByPrimaryKey(eqid);
            System.out.println("success2");
        }
        else
            System.out.println("无此种类");

    }

    @Test
    public void selectByPrimaryKeyTest(){

        EqCorrelation EqCorrelation=EqCorrelationService.selectByPrimaryKey(1);
        if(EqCorrelation!=null) {

            System.out.println("success3");
        }
        else
            System.out.println("无此种类");

    }

    @Test
    public void updateByPrimaryKeyTest(){

        EqCorrelation EqCorrelation=EqCorrelationService.selectByPrimaryKey(3);
        if(EqCorrelation==null)
            System.out.println("无此种类");
        else {
            EqCorrelation.setEqChildId(2);
            EqCorrelation.setEqParentId(20);
            EqCorrelationService.updateByPrimaryKey(EqCorrelation);
        }
        System.out.println("success4");
    }

    @Test
    public void selectByExampleTest(){

        EqCorrelationExample EqCorrelationExample1=new EqCorrelationExample();

        EqCorrelationExample1.or().andEqCoIdIsNotNull();

        List<EqCorrelation> eqCorrelationList=EqCorrelationService.selectByExample(EqCorrelationExample1);

        for (EqCorrelation eq:
                eqCorrelationList) {

            System.out.println(eq.toString());


        }
        System.out.println("success5");

    }

}
