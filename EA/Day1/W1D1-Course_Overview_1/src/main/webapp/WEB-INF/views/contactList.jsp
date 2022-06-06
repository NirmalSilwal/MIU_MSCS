<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Contacts</title>
    </head>
    <body>
        <h1>List of Contacts:</h1>
        <table>
            <c:forEach var="contact" items="${contacts}">
                <tr>
                    <td><a href="contact/${contact.id}">${contact.name}</a></td>
                </tr>
            </c:forEach>
        </table>

        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <form:form modelAttribute="contact" action="contact" method="post">
                <h2>Add a contact:</h2>
                <form:errors path="*" cssClass="error" element="div" />
                <table>
                    <tr>
                        <td>Name:</td>
                        <td>
                            <form:input path="name" />
                            <input type="submit" value="Add"/>
                        </td>
                    </tr>
                </table>
            </form:form>
        </sec:authorize>

        <form:form method="post" action="/logout">
            <input type="submit" value="logout" />
        </form:form>
    </body>

</html>