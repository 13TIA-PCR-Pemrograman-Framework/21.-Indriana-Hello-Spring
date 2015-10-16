<%-- 
    Document   : nameView
    Created on : Oct 15, 2015, 1:59:15 PM
    Author     : LabGSG-3
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <h1>Isi Data Diri Anda</h1>
        <spring:nestedPath path="data">
            <form action="" method="post">
                <table>
                    <tr>
                        <td>Name</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="name">
                                    <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>NIM</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="nim">
                            <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="address">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="OK"></td>
                    </tr>
                </table>
            </form>
        </spring:nestedPath>
    </body>
</html>
