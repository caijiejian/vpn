package com.sinozo.vpn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Properties;

@SpringBootTest
class VpnApplicationTests {

    @Test
    void contextLoads() {
        String filePath = "D:\\IDEA_workspace\\svn\\src\\main\\webapp\\language\\en\\common_en.properties";
        //List<ProductInfo> proList = proDao.findObjects(null, null);
        OutputStreamWriter oStreamWriter = null;
        try {
            oStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), "utf-8");
            FileInputStream is = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            Properties pop = new Properties();
            pop.load(reader);
            System.out.println("22");
        }catch (Exception e) {
            System.out.println("1111");
        }
    }

}
