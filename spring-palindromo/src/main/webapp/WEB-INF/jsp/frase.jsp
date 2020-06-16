<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1 >Le parole totali sono: </h1>
    <c:out value="${risultato.getParoleTot()}"></c:out>
    <h1 >Le parole palindrome totali sono: </h1>
    <c:out value="${risultato.getParolePalindrome()}"></c:out>
    <h1 >Le parole totali sono: </h1>
    <c:forEach items="${risultato.getParole()}" var="patologia">           
    <c:out value = "${risultato.getParole()}"/>
</c:forEach>
</body>
</html>