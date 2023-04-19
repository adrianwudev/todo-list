<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ad.adlearn.util.Mappings" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}" />
        <h2><a href="${itemsLink}">Show Todo Items</a></h2>
    </div>
</body>
</html>