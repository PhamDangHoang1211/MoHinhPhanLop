/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hung Tuong Vy
 */
public class MySQLConnect {
    String host="";
    String Username="";
    String Password="";
    String dtbase="";
    
    Connection connect=null;
    Statement statement=null;
    ResultSet result=null;
    
    public MySQLConnect() {
        this.host="localhost";
        this.Username="root";
        this.Password="";
        this.dtbase="coffee";
    }
    protected void driverTest() throws Exception{
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException ex) {
            throw new Exception("MySQL Driver not found !");
        }
    }
    
    protected Connection getConnect() throws Exception{
        if(this.connect==null){
            driverTest();
        }
        String url = "jdbc:mysql://"+this.host+":3306/"+this.dtbase;
        //jdbc:mysql://localhost:3306/coffee
        
        try {
            this.connect=DriverManager.getConnection(url,this.Username,this.Password);
        } catch (Exception e) {
            throw new Exception("Không thể kết nối tới Database");
        }
        return this.connect;
    }
    
    protected Statement getStatement() throws SQLException, Exception{
        if(this.statement==null ? true : this.statement.isClosed()){
            this.statement=this.getConnect().createStatement();
        }
        return this.statement;
    }
    
    public ResultSet excuteQuery(String query) throws Exception{
        try {
            this.result=getStatement().executeQuery(query);
        } catch (Exception e) {
            throw new Exception("Error "+e.getMessage()+"- "+query);
        }
        return this.result;
    }
    
    public int excuteUpdate(String query) throws Exception{
        int res=Integer.MIN_VALUE;
        try {
            res=getStatement().executeUpdate(query);
        } 
        catch (Exception e) {
            throw new Exception("Error "+e.getMessage()+" - "+query);
                    
        }
        finally{
            this.Close();
        }
        return res;
        
    }

    public void Close() throws SQLException {
       if(this.result!=null&&!this.result.isClosed())
       {
           this.result.close();
           this.result=null;
       }
       if(this.statement!=null&& !this.statement.isClosed())
       {
           this.statement.close();
           this.statement=null;
       }
       if(this.connect!=null && !this.connect.isClosed())
       {
           this.connect.close();
           this.connect=null;
       }
    }

    int excuteUpdate(StringBuilder query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
