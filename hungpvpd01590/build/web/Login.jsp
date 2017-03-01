<%-- 
    Document   : Login
    Created on : Sep 30, 2016, 10:11:10 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <center>
                <form action="LoginServlet" method="get">
                <h1> Vui lòng, đăng nhập tài khoản</h1>
                <p>Tài khoản: <input type="text" name="t1" value="" size="20" /> </p>
                <p>Mật khẩu: <input type="password" name="t2" value="" size="20" /> </p>
                <p> <input type="submit" value="Đăng nhập"  /> </p>
                </form>
            </center>
        </div>
    </body>
</html>
