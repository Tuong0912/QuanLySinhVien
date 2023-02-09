//package CaseMD3.dao;
//
//import com.example.petshop.model.Customer;
//
//import java.sql.*;
//
//public class CustomerDAO {
//    String jdbcURL = "jdbc:mysql://localhost:3306/petshop";
//    String jdbcUsername = "root";
//    String jdbcPassword = "123456";
//   public Customer checkLogin(String email, String password) throws ClassNotFoundException {
//       String query = "select * from customer where Email = ? and Pass = ?";
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       try (Connection conn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword))
//       {
//           PreparedStatement ps = conn.prepareStatement(query);
//           ps.setString(1,email);
//           ps.setString(2,password);
//           ResultSet rs =ps.executeQuery();
//           while (rs.next()){
//               return new Customer(rs.getInt(1),rs.getString(2),
//                       rs.getString(3),rs.getString(4),
//                       rs.getString(5),rs.getString(6));
//           }
//
//       } catch (SQLException e) {
//           throw new RuntimeException(e);
//       }
//       return null;
//   }
//   public void creatCustomer(String email,String pass,String fullName) throws ClassNotFoundException {
//       String query = "insert into customer(email,pass,name) values (?,?,?)";
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       try (Connection conn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword))
//       {
//           PreparedStatement ps = conn.prepareStatement(query);
//           ps.setString(1,email);
//           ps.setString(2,pass);
//           ps.setString(3,fullName);
//           ps.executeQuery();
//
//       } catch (SQLException e) {
//           throw new RuntimeException(e);
//       }
//
//   }
//   public Customer checkExistCustomer(String email) throws ClassNotFoundException {
//       String query = "select * from customer where Email = ?";
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       try (Connection conn = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword))
//       {
//           PreparedStatement ps = conn.prepareStatement(query);
//           ps.setString(1,email);
//           ResultSet rs = ps.executeQuery();
//           while (rs.next()){
//               return new Customer(rs.getInt(1),rs.getString(2),
//                       rs.getString(3),rs.getString(4),
//                       rs.getString(5),rs.getString(6));
//           }
//
//       } catch (SQLException e) {
//           throw new RuntimeException(e);
//       }
//       return null;
//
//   }
//
//
//}
