<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Job</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2 class="text-center mb-4">Add New Job</h2>

    <div class="card shadow p-4">
        <form action="addjob" method="post">

            <div class="mb-3">
                <label class="form-label">Job Title</label>
                <input type="text" name="title" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Company</label>
                <input type="text" name="company" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Salary in LPA</label>
                <input type="number" name="salary" class="form-control">
            </div>

            <div class="mb-3">
                <label class="form-label">Description</label>
                <textarea name="description" class="form-control" rows="5"></textarea>
            </div>

            <button type="submit" class="btn btn-primary w-100">Add Job</button>
        </form>
    </div>
</div>

</body>
</html>
