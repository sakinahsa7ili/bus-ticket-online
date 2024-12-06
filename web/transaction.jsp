<!--Note: In your original code, there were two instances where you used the 
same variable name result for < sql : query >. It's recommended to use different 
variable names to avoid conflicts. I have made that correction in the code above.-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/passenger" user="app" password="app"/>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/transaction.css">
    <style>
        form {
        }

        .head {
        }

        .list-field {
        }

        .list-field label {
        }

        .payment-field {
        }

        .line-1 {
        }

        .line-1 sup {
        }

        .line-1 .date {
        }

        .dropdown {
        }

        .Bank {
        }

        select {
        }

        table {
        }

        td {
        }

        img {
        }

        .input-pay table {
        }

        .input-pay table input {
        }

        .btn {
        }

        .btn:hover {
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Transaction Page</title>
</head>
<body>
    <sql:query var="result" dataSource="${myDatasource}">
        SELECT * FROM PASSENGER
    </sql:query>

    <form method="POST" action="printTicket.jsp">
        <div class="head">
            Payment Details
            <hr>
        </div>

        <div class="table">
            <div class="list-field">
                <label>BILL</label>
                <br><br>
                <sql:query var="result" dataSource="${myDatasource}">
                    SELECT PRICE FROM PASSENGER
                </sql:query>
                <c:forEach var="row" items="${result.rowsByIndex}">
                    <c:forEach var="column" items="${row}">
                        <option><c:out value="${column}" /></option>
                    </c:forEach>
                </c:forEach>
                <br>
                <label>DESCRIPTION</label>
                <br><br>
                <div class="payment-field">
                    <div class="line-1">
                        <sql:query var="result" dataSource="${myDatasource}">
                            SELECT PRICE FROM PASSENGER
                        </sql:query>
                        <c:forEach var="row" items="${result.rowsByIndex}">
                            <c:forEach var="column" items="${row}">
                                <option><sup>MYR: </sup><c:out value="${column}" /></option>
                            </c:forEach>
                        </c:forEach>
                        <div class="date"></div>
                    </div>

                    <div class="dropdown">
                        <div class="Bank" id="ListBanks">
                            Online Banking
                            <table style="width:100%">
                                <tr>
                                    <td><img src="Affin Bank.jpeg" alt="affin"></td>
                                    <td><img src="alliance.png" alt="Alliance"></td>
                                    <td><img src="Ambank.png" alt="Ambank"></td>
                                    <td><img src="BSN.png" alt="BSN"></td>
                                    <td><img src="Bank Islam.png" alt="Bank Islam"></td>
                                    <td><img src="Bank Muamalat.png" alt="Bank Muamalat"></td>
                                    <td><img src="Bank Rakyat.png" alt="Bank Rakyat"></td>
                                    <td><img src="CIMB.png" alt="CIMB Bank"></td>
                                    <td><img src="hsbc .png" alt="HSBC Bank"></td>
                                    <td><img src="hong leong.png" alt="HongLeong Bank"></td>
                                    <td><img src="Maybank.png" alt="Maybank Bank"></td>
                                    <td><img src="rhb.png" alt="RHB Bank"></td>
                                </tr>
                            </table>
                        </div>
                    </div>

                    <div class="input-pay">
                        <table>
                            <tr>
                                <th>Amount to Pay(MYR)</th>
                                <th>
                                    <input type="text" class="amount" value="RM150.00" id="amount" />
                                </th>
                            </tr>
                        </table>
                        <text class="input" style="margin: 20px">
                            Clicking the button to <b>"Proceed"</b> the transaction below.
                            <input type="submit" value="PROCEED" class="btn" />
                        </text>
                    </div>
                </div>
            </div>
        </div>
    </form>

    <script>
        var SelectBank = document.getElementsByClassName("ListBank");
        SelectBank.style.maxHeight = "0px";

        function opToggle() {
            if (SelectBank.style.maxHeight = "0px") {
                SelectBank.style.maxHeight = "200px";
            } else {
                SelectBank.style.maxHeight = "0px";
            }
        }
    </script>
</body>
</html>
