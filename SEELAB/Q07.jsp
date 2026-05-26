<%@ page language="java" %>

<html>

<head>
    <title>Grade Calculator</title>
</head>

<body>

<h2>Student Grade Calculator</h2>

<form method="post">

    Enter Marks:

    <input type="text" name="marks">

    <br><br>

    <input type="submit" value="Calculate Grade">

</form>

<%

    String m = request.getParameter("marks");

    if(m != null)
    {

        int marks = Integer.parseInt(m);

        String grade;

        if(marks >= 90)
        {
            grade = "O";
        }

        else if(marks >= 80)
        {
            grade = "A+";
        }

        else if(marks >= 70)
        {
            grade = "A";
        }

        else if(marks >= 60)
        {
            grade = "B+";
        }

        else if(marks >= 50)
        {
            grade = "B";
        }

        else if(marks >= 45)
        {
            grade = "C";
        }

        else if(marks >= 40)
        {
            grade = "P";
        }

        else
        {
            grade = "F";
        }

        out.println("<h3>Grade = " + grade + "</h3>");
    }

%>

</body>

</html>
