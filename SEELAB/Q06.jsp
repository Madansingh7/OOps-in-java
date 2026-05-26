
//calculator 

<%@ page language="java" %>

<html>

<head>
    <title>Simple Calculator</title>
</head>

<body>

<h2>Simple Calculator</h2>

<form method="post">

    Enter First Number:
    <input type="text" name="num1">
    
    <br><br>

    Enter Second Number:
    <input type="text" name="num2">

    <br><br>

    Select Operation:

    <select name="operation">

        <option value="add">Addition</option>

        <option value="sub">Subtraction</option>

        <option value="mul">Multiplication</option>

        <option value="div">Division</option>

    </select>

    <br><br>

    <input type="submit" value="Calculate">

</form>

<%

    String n1 = request.getParameter("num1");
    String n2 = request.getParameter("num2");
    String op = request.getParameter("operation");

    if(n1 != null && n2 != null)
    {

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        int result = 0;

        if(op.equals("add"))
        {
            result = num1 + num2;
        }

        else if(op.equals("sub"))
        {
            result = num1 - num2;
        }

        else if(op.equals("mul"))
        {
            result = num1 * num2;
        }

        else if(op.equals("div"))
        {
            result = num1 / num2;
        }

        out.println("<h3>Result = " + result + "</h3>");
    }
    else{
    	out.println("Error");
    }

%>

</body>

</html>
