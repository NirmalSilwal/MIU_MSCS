<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Contact</title>
</head>

<body>
    <table>
        <tr>
            <td>Name:</td>
            <td>
                <form:form action="../contacts/${contact.id}" method="post" modelAttribute="contact">
                    <form:input path="name" />
                    <form:errors path="name" cssClass="error" />
                    <input type="hidden" name="id" value="${contact.id}" />
                    <input type="submit" value="update" />
                </form:form>
            </td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td>
                <ul>
                    <c:forEach var="phone" items="${contact.phones}">
                        <li>${phone.phone}</li>
                    </c:forEach>
                </ul>
                <form:form method="POST" action="/cov2/contacts/${contact.id}/addPhone" modelAttribute="phone">
                    <input type="submit" value="Add number" />
                    <form:input path="phone" />
                    <form:errors path="phone" />
                </form:form>
            </td>
        </tr>
        <tr>
            <td>Email:</td>
            <td>
                <ul>
                    <c:forEach var="email" items="${contact.emails}">
                        <li>${email.email}</li>
                    </c:forEach>
                </ul>
                <form:form method="POST" action="/cov2/contacts/${contact.id}/addEmail" modelAttribute="email">
                    <input type="submit" value="Add email" />
                    <form:input path="email" />
                    <form:errors path="email" />
                </form:form>

            </td>
        </tr>
    </table>

    <form:form action="../contacts/delete/${contact.id}" method="post">
        <button type="submit">Delete</button>
    </form:form>
    <a href="../"><button>Back</button></a>
</body>

</html>