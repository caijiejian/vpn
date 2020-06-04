package com.sinozo.vpn;

import java.io.*;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/common_en.properties";
        File file = new File(filePath);
        System.out.println(file.getAbsoluteFile());
        String filePath1 = "D:\\IDEA_workspace\\svn\\target\\ttms1.01-0.0.1-SNAPSHOT\\language\\en\\common_en.properties";
        //List<ProductInfo> proList = proDao.findObjects(null, null);
        OutputStreamWriter oStreamWriter = null;
        Properties pop = new Properties();
        try {

            FileInputStream is = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");

            pop.load(reader);
            pop.setProperty("cai","jian");
        }catch (Exception e) {
            System.out.println("1111");
        }finally {
            oStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), "utf-8");
            pop.store(oStreamWriter, "en_language");
        }
    }
}
