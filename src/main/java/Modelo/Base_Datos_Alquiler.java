/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Base_Datos_Alquiler {
   public Datos_Basico_Alquiler obj;
    public Connection connection;

    public void conectar() {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("MySQL JDBC Driver Registered!");

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/public", "root", "root");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }

    }

    public void desconectar() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int agregar(int a, java.sql.Date b, java.sql.Date c, int d, int e, int f) {
//        Insertion 
//	 create a sql date object so we can use it in our INSERT statement
        

        // the mysql insert statement
        String query = " insert into Hotel (idAlquiler,Fecha_Inicio,Fecha_Final,Hotel_Hotel,Responsable.idHabitacion)"
                + " values (?, ?, ?, ?, ?, ?)";

        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, a);
            preparedStmt.setDate(2, b);
            preparedStmt.setDate(3, c);
            preparedStmt.setInt(4, d);
            preparedStmt.setInt(5, e);
            preparedStmt.setInt(6, f);
            
           
            // execute the preparedstatement
            preparedStmt.execute();

            System.out.println("You made it, the insertion is ok!");

        } catch (SQLException ee) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make insertion!");
            
            ee.printStackTrace();
            return 0;
        }
    return 1;
    }

    public Datos_Basico_Alquiler buscar(int a) throws SQLException {
        Datos_Basico_Alquiler dos = new Datos_Basico_Alquiler();
        try {
            // create the java statement

            Statement st = connection.createStatement();

            // execute the query, and get a java resultset
            String query = "SELECT * FROM Alquiler where idAlquiler = " + a ;
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
            // iterate through the java resultset
            dos.setId_Alquiler(rs.getInt("idAlquiler"));
            dos.setFI(rs.getDate("Fecha_Inicio"));
            dos.setFF(rs.getDate("Fecha_Final"));
            dos.setId_Hotel(rs.getInt("Hotel_Hotel"));
            dos.setResponsable(rs.getInt("Responsable"));
            dos.setId_Habitacion(rs.getInt("idHabitacion"));
           
            }
            // print the results
            st.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make update!");
            e.printStackTrace();
            return null;
        }

        return dos;
    }

    public int actualizar(java.sql.Date a, java.sql.Date b, int c, int d, int e, int f) {
        try {
            //Update

            if (buscar(c).getId_Alquiler()==0) {
               return 0; 
            }
            // create the java mysql update preparedstatement
            String query = "update Hotel set Fecha_Inicio = ? ,Fecha_Final = ? , Hotel_Hotel = ? , Responsable = ? , idHabitacion = ? where idAlquiler = ?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setDate(1, a);
            preparedStmt.setDate(2, b);
            preparedStmt.setInt(6, c);
            preparedStmt.setInt(3, d);
            preparedStmt.setInt(4, e);
            preparedStmt.setInt(5, f);
            

            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
        } catch (SQLException er) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make update!");
          er.printStackTrace();
            
        }
        return 1;
    }

    public int eliminar(int a) {
        try {
            if (buscar(a).getId_Alquiler()==0) {
               return 0; 
            }
            String query = "delete from Hotel where idAlquiler = ? ";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, a);
      
            preparedStmt.execute();
            System.out.println("eliminado");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make update!");
            e.printStackTrace();
        }
        return 1;
    }

    public ArrayList<Datos_Basico_Alquiler> cargar() throws SQLException {
        ArrayList<Datos_Basico_Alquiler> at = new ArrayList<Datos_Basico_Alquiler>();
        try {
            // create the java statement

            Statement st = connection.createStatement();

            // execute the query, and get a java resultset
            String query = "SELECT * FROM Hotel ";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Datos_Basico_Alquiler dos = new Datos_Basico_Alquiler();
            // iterate through the java resultset
           dos.setId_Alquiler(rs.getInt("idAlquiler"));
            dos.setFI(rs.getDate("Fecha_Inicio"));
            dos.setFF(rs.getDate("Fecha_Final"));
            dos.setId_Hotel(rs.getInt("Hotel_Hotel"));
            dos.setResponsable(rs.getInt("Responsable"));
            dos.setId_Habitacion(rs.getInt("idHabitacion"));
           
            at.add(dos);
            }
            // print the results
            st.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make update!");
            e.printStackTrace();
            return null;
        }
        return at;
}
   
}
