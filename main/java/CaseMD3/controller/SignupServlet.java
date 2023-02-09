//package CaseMD3.controller;
//
////import com.example.petshop.dao.CustomerDAO;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebServlet(name = "signupServlet", value = "/signup")
//public class SignupServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//    public void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
//        String fullName = request.getParameter("fullName");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password") ;
//        String rePassword = request.getParameter("rePassword") ;
//        String messSignup = "Passwords do not match";
//        String messCustomer = "Email is exits, enter again";
//
//        if (!password.equals(rePassword)){
//            request.setAttribute("messSignup",messSignup);
//            request.getRequestDispatcher("signup.jsp");
//        }else {
//            CustomerDAO customerDAO = new CustomerDAO();
//            if (customerDAO.checkExistCustomer(email) == null){
//                customerDAO.creatCustomer(email,password,fullName);
//            }else {
//                request.setAttribute("messSignup",messCustomer);
//            }
//        }
//    }
//}