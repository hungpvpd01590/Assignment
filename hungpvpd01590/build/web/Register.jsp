<%-- 
    Document   : Register
    Created on : Sep 30, 2016, 10:11:20 PM
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
    <div id="loginForm">
	<div class="headLoginForm">
            <center>Register</center>
	</div>
	<div class="fieldLogin">
            <form action="dangky" method="GET">
            <span style="color:red;">(*)</span>
	<label>Tên Đăng Nhập</label><br>
        <input type="text" class="login" name="Username"><br><span style="color:red;">(*)</span>
	<label>Mật Khẩu :</label><br>
	<input type="password" class="login" name="Pass"><br><span style="color:red;">(*)</span>
        <label>Vai Trò :</label><br>
        <input type="text" class="login" name="Vai_tro"><br><span style="color:red;">(*)</span>
        <label>Họ Và Tên :</label><br>
        <input type="text" class="login" name="Ho_ten"><br><span style="color:red;">(*)</span>
         <label>Địa Chỉ :</label><br>
        <input type="text" class="login" name="Dia_chi"><br><span style="color:red;">(*)</span>
         <label>Email :</label><br>
        <input type="text" class="login" name="Email"><br><span style="color:red;">(*)</span>
         <label>SĐT :</label><br>
        <input type="text" class="login" name="Sdt"><br><span style="color:red;">(*)</span>

        
        <input type="submit" class="button" value="Register"  name ="Register"> <br>
                
        
                  </form>
	</div>
</div>
    </body>
</html>
