<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ad.adlearn.util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
    <c:url var="itemsLink" value="${Mappings.ITEMS}" />
    <a href="${itemsLink}">Todo Item List</a>
        <table>
            <tr>
                <td><label>ID</label></td>
                <td>${viewItem.id}</td>
            </tr>
            <tr>
                <td><label>Title</label></td>
                <td>${viewItem.title}</td>
            </tr>
            <tr>
                <td><label>Deadline</label></td>
                <td>${viewItem.deadline}</td>
            </tr>
            <tr>
                <td><label>Details</label</td>
                <td>${viewItem.details}</td>
            </tr>
        </table>
    </div>
</body>
</html>