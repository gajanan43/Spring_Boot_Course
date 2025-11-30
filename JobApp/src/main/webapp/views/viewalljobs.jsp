<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Jobs</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2 class="text-center mb-4">All Job Listings</h2>

    <table class="table table-bordered table-striped shadow">
        <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Company</th>
            <th>Location</th>
            <th>Salary(LPA)</th>
            <th>Description</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="job" items="${jobs}">
            <tr>
                <td>${job.id}</td>
                <td>${job.title}</td>
                <td>${job.company}</td>
                <td>${job.location}</td>
                <td>${job.salary}</td>
                <td>${job.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="text-center">
        <a href="home" class="btn btn-secondary">Back to Home</a>
    </div>
</div>

</body>
</html>
