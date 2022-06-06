<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Contact</title>
    </head>
    <body>
        <a href="../contact"><button>Back</button></a>        
        <table>
            <tr>
                <td>Name:</td>
                <td>
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        <form:form action="../contact/${contact.id}" method="post" modelAttribute="contact">
                            <input type="hidden" name="id" value="${contact.id}" /> 
                            <input type="submit" value="update" />
                            <form:input path="name" /> 
                            <form:errors path="name" cssClass="error"/>
                        </form:form>
                    </sec:authorize>
                    <sec:authorize access="!hasRole('ROLE_ADMIN')">
                        ${contact.name}
                    </sec:authorize>
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
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        <form:form method="POST" action="../contact/${contact.id}/addPhone" modelAttribute="phone">
                            <input type="submit" value="Add number"/> 
                            <form:input path="phone" />
                            <form:errors path="phone" />
                        </form:form>
                    </sec:authorize>
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
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        <form:form method="POST" action="../contact/${contact.id}/addEmail" modelAttribute="email">
                            <input type="submit" value="Add email"/> 
                            <form:input path="email" />
                            <form:errors path="email" />
                        </form:form>
                    </sec:authorize>

                </td>
            </tr>
        </table>

        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <form:form action="../contact/${contact.id}/delete" method="post">
                <button type="submit">Delete</button>
            </form:form>
        </sec:authorize>
    </body>
</html>