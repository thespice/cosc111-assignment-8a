<%-- 
    Document   : GuessingGame.jsp
    Created on : Apr 6, 2017, 4:39:29 AM
    Author     : mochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="guess" class="user.GuessGame" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-gfdgdf="Content-Type" content="text/html; charset=UTF-8">
        <title>Guessing Game</title>
    </head>
    <body>
        <h1>Guessing Game</h1>
        <p>
            <% 
                guess.generateNum();
                session.setAttribute("number", guess.getNum());                
            %>
            A number between 0 and 1000 has been generated. Try guessing what it is.
        </p>
        
        <p>
            <FORM METHOD="POST" ACTION="CalcGuess.jsp">
            Guess: <INPUT TYPE="TEXT" NAME="guess" SIZE="3" /><BR />        
            <p>
                <input TYPE="SUBMIT" />
            </p>
        </FORM>
        </p>
    </body>
</html>
