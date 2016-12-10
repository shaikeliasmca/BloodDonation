package com.javatpoint;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{

    public void contextInitialized(ServletContextEvent arg0) {
        int status = 0;
        Connection con = null;
        try {
            con = GetCon.getCon();
            PreparedStatement ps1 = con
                    .prepareStatement("Select * from NEWCUST4");
            try {
                status = ps1.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
                status = -1;
                System.out.println("my staus is1111111" + status);
            }

            if (status == 0) {
                System.out.println("your table name already exist" + status);
            } else if (status < 0) {
                System.out
                        .println("else if part table does not exist new table has created"
                                + status);
                PreparedStatement ps6 = con
                        .prepareStatement("CREATE TABLE  USERROLE(ROLE VARCHAR2(4000),ROLE_DESC VARCHAR2(4000),PRIMARY KEY (ROLE))");
                ps6.executeUpdate();
                ps6 = con.prepareStatement("Insert into USERROLE values(?,?)");
                ps6.setString(1, "admin");
                ps6.setString(2, "admin is having all rights");
                ps6.executeUpdate();
                ps6.setString(1, "user");
                ps6.setString(2, "user is having only limited rights");

                ps6.executeUpdate();

                PreparedStatement ps3 = con
                        .prepareStatement("CREATE SEQUENCE javatpoint1 MINVALUE 1 MAXVALUE 999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE");
                ps3.executeUpdate();

                PreparedStatement ps = con
                        .prepareStatement("CREATE TABLE  NEWCUST4(ID NUMBER PRIMARY KEY,USERNAME VARCHAR2(4000),PASSWORD VARCHAR2(4000), REPASSWORD VARCHAR2(4000),DISNAME VARCHAR2(4000), ADDERESS VARCHAR2(4000),CITYNAME VARCHAR2(4000),STATENAME VARCHAR2(4000),COUNTRY VARCHAR2(4000),"
                                + "REGION VARCHAR2(4000),PHONE NUMBER,EMAIL VARCHAR2(4000),"
                                + "verified CHAR(1), ROLE VARCHAR2(4000) references USERROLE(ROLE))");
                ps.executeUpdate();
                ps = con.prepareStatement("Insert into NEWCUST4 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, 2);
                ps.setString(2, "elias");
                ps.setString(3, "elias");
                ps.setString(4, "admin");
                ps.setString(5, "admin");
                ps.setString(6, "bza");
                ps.setString(7, "bza");
                ps.setString(8, "AP");
                ps.setString(9, "india");
                ps.setString(10, "abc");
                ps.setBigDecimal(11, new BigDecimal("7829464026"));
                ps.setString(12, "elias@sona.com");
                ps.setString(13, "Y");
                ps.setString(14, "admin");

                ps.executeUpdate();

                PreparedStatement ps2 = con
                        .prepareStatement("CREATE TABLE  NEWORDER4(ID NUMBER,BLOODGROUP VARCHAR2(4000),"
                                + "PATIENTNAME VARCHAR2(4000),HOSPITALADDRESS VARCHAR2(4000),"
                                + "PHONE NUMBER,PRIMARY KEY (ID))");
                ps2.executeUpdate();

                PreparedStatement ps4 = con
                        .prepareStatement("CREATE TABLE  PHARMACYADMIN(USERNAME VARCHAR2(4000),PASSWORD VARCHAR2(4000))");
                ps4.executeUpdate();
                ps4 = con
                        .prepareStatement("Insert into PHARMACYADMIN values(?,?)");
                ps4.setString(1, "admin");
                ps4.setString(2, "admin");

                ps4.executeUpdate();
                // ps4.setString(1, "elias");
                // ps4.setString(2, "elias");

                PreparedStatement ps5 = con
                        .prepareStatement("CREATE TABLE  DISTRIBUTERADMIN(USERNAME VARCHAR2(4000),PASSWORD VARCHAR2(4000))");
                ps5.executeUpdate();

                ps5 = con
                        .prepareStatement("Insert into DISTRIBUTERADMIN values(?,?)");
                ps5.setString(1, "dis");
                ps5.setString(2, "dis");
                ps5.executeUpdate();

            }

            else {
                System.out.println("else part " + status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("project undeployed");

    }
}
