<%-- 
    Document   : Administrator
    Created on : Sep 30, 2016, 10:12:45 PM
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
      <div class="dangky">
             <%
            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            %>
       
                    <center></br></br></br>
       <form action="getProduct" method="post">
           <center>
                 <script>
                        function ac0() {
                            var a0 = 0;
                            document.getElementById("ac").value = a0;

                        }
                        function ac1() {
                            var a1 = 1;
                            document.getElementById("ac").value = a1;
                        }
                        function ac2() {
                            var a2 = 2;
                            document.getElementById("ac").value = a2;
                        }
                        function ac3() {
                            var a3 = 3;
                            document.getElementById("ac").value = a3;
                        }
                      
                    </script>
		<table width="95%" border="1" >
			
			<tr><td><b>Mã Sản Phẩm</b></td><td>
                             
                               
                                <input type="text" class="" name="Ma_sp" name="Ma_sp" value="<%=Model.getProduct.masp%>"><input type="submit" value="Tìm" onclick="ac0()"></td>
				
              
			</td></tr>
                        <tr><td><b>Tên Sản Phẩm</b></td><td>
                                <input type="text" class="panjang" name="Ten_sp" value="<%=Model.getProduct.tensp%>"</td></tr>
			
			 <tr><td><b>Mô Tả</b></td><td>
                                <input type="text" class="panjang" name="Mo_ta" value="<%=Model.getProduct.mota%>"</td></tr>	
			</td></tr>
			 <tr><td><b>Số Lượng</b></td><td>
                                <input type="text" class="panjang" name="So_luong" value="<%=Model.getProduct.soluong%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Đơn Giá</b></td><td>
                                <input type="text" class="panjang" name="Don_gia" value="<%=Model.getProduct.dongia%>"</td></tr>	
			</td></tr>
                        <tr><td><b>Hình Ảnh</b></td><td>
                                <input type="text" class="panjang" name="Hinh_anh" value="<%=Model.getProduct.hinhanh%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Nhà Sản Xuất</b></td><td>
                                <input type="text" class="panjang" name="Nha_sx" value="<%=Model.getProduct.nhasx%>"</td></tr>	
                          <tr><td><b>Mã Loại</b></td><td>
                                <input type="text" class="panjang" name="Ma_loai" value="<%=Model.getProduct.maloai%>"</td></tr>	
			</td></tr>
			</td></tr>
			<tr><td>
                               
                            <td height="40"><input type="submit" value="Thêm" onclick="ac1()" >  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
			</td></tr>
                        <input type="text" value="" style="display: none" id="ac" name="ac"> 
                </table>
                        </center> 
       </form></center></div>
    </body>
</html>
