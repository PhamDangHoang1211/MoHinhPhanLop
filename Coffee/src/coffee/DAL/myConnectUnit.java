/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.DAL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Hung Tuong Vy
 */
public class myConnectUnit {
    public MySQLConnect connect=new MySQLConnect();
    
    //Hàm hỗ trợ SELECT CSDL
    //SELECT * FROM Table_Name WHERE condition ORDER BY OrderBy
    public ResultSet Select(String TableName , String Condition , String Order_By) throws Exception{
        
        StringBuilder query=new StringBuilder("SELECT * FROM "+TableName);
        
        this.AddCondition(query,Condition);
        
        this.AddOrderBy(query,Order_By);
        
        query.append(";");
        
        return this.connect.excuteQuery(query.toString());
    }
    
    //Hàm overload Select giảm OrderBy parament
    public ResultSet Select(String TableName , String Condition) throws Exception{
        return this.Select(TableName,Condition,null);
    }
    
    //Hàm overload Select chỉ có Table_Name Parament
    
    public ResultSet Select(String TableName) throws Exception{
        return this.Select(TableName, null);
    }
    
    //Hàm hỗ trợ INSERT xuống CSDL
    //INSERT INTO TableName (columnName...) VALUES(columnValue)
    
    public boolean Insert(String TableName,HashMap<String,Object> ColumnValue) throws Exception{
        StringBuilder query =new StringBuilder("INSERT INTO "+TableName);
        
        StringBuilder valueInsert=new StringBuilder();
        
        query.append("(");
        
        for(String key: ColumnValue.keySet()){
            query.append(key+",");
            valueInsert.append("'"+ColumnValue.get(key).toString()+"',");
        }
        
        query=query.delete(query.length()-1, query.length());
        valueInsert=valueInsert.delete(valueInsert.length()-1,valueInsert.length());
        
        query.append(") VALUES ("+valueInsert.toString()+")");
        
        query.append(";");
        String temp=query.toString();
        return this.connect.excuteUpdate(temp)> 0;
    }
    
    //Hàm hỗ trợ UPDATE lên CSDL
    //UPDATE tableName SET columnName= ColumnValue WHERE condition
    
    public boolean Update(String TableName , HashMap<String,Object> columnValue, String Condition ) throws Exception{
        StringBuilder query=new StringBuilder(" UPDATE "+TableName+" SET ");
        
        for(String key: columnValue.keySet()){
            query.append(key+" = '"+columnValue.get(key).toString()+"' ,");
        }
        
        query=query.delete(query.length()-1, query.length());
        this.AddCondition(query, Condition);
        query.append(";");
        System.out.println(query);
        return this.connect.excuteUpdate(query.toString())>0;
        
        
    }
    
    //Hàm DELETE
    //DELETE FROM TableName WHERE conditon
    public boolean Delete(String TableName , String Condition) throws Exception{
        StringBuilder query=new StringBuilder("DELETE FROM "+TableName);
        this.AddCondition(query,Condition);
        System.out.println(query);
        query.append(";");
        System.out.println(query);
        return this.connect.excuteUpdate(query.toString())>0;  
    }
    
    //Đếm số cột trong Result Select từ CSDL
    public static int getColumnCount(ResultSet Result) throws SQLException{
        return Result.getMetaData().getColumnCount();
    }
    
    //Lấy danh sách tên cột trong TableName từ CSDL
    public static String[] getColumnName(ResultSet Result) throws SQLException{
        ResultSetMetaData rsMetaData=Result.getMetaData();
        int ColCount=rsMetaData.getColumnCount();
        String[] list=new String[ColCount];
        for(int i=0;i<ColCount;i++){
            list[i]=rsMetaData.getColumnName(i);
        }
        return list;
    }
    private void AddCondition(StringBuilder query, String Condition) {
        if(Condition!=null)
        {
            query.append(" WHERE " + Condition);
        } 
    }

    private void AddOrderBy(StringBuilder query, String Order_By) {
        if(Order_By!=null)
        {
            query.append(" ORDER BY "+Order_By);
        }
    }
    
}
