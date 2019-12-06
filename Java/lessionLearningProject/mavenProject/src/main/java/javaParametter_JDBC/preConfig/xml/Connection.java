package javaParametter_JDBC.preConfig.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.*;
import java.util.logging.Logger;

@Component
public class Connection {
    private  Logger logger = Logger.getLogger(Connection.class.getName());
    private  ModelDbInfo modelDbInfo ;
    private Connection connection;

    @Autowired
    public Connection(ModelDbInfo modelDbInfo){
        this.modelDbInfo= modelDbInfo;
        connection = getConnection();
    }

    public  Connection getConnection() {
        try {
            Class.forName(modelDbInfo.getUsername());
            connection = DriverManager.ge(modelDbInfo.getUrl(),
                    modelDbInfo.getUsername(), modelDbInfo.getPassword());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } return connection;
    };


};
