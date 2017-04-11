<%-- 
    Document   : CalcGuess.jsp
    Created on : Apr 6, 2017, 4:55:03 AM
    Author     : mochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="guess" class="user.GuessGame" scope="session"/>
<jsp:setProperty name="guess" property="*"/> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guessing Game Calculator</title>
    </head>
    <body>
        <h1>
            Guessing Game: 
        </h1>
        <h2>
            <p>
                You guessed <%= guess.getGuess()%>.
            </p>
            <p>
                <% 
                    // Get the value guessed from the session
                    String num_str = session.getAttribute("number").toString();
                    int num = Integer.parseInt(num_str);
                    guess.setNum(num);      
                    
                    // Inform the user if their guess is correct or not        
                    if (guess.getNum() == guess.getGuess())
                    {
                        out.println("Correct! You have guessed correctly.");
                    }
                    if (guess.getNum() < guess.getGuess())
                        out.println("Incorrect! Go lower.");
                    if (guess.getNum() > guess.getGuess())
                        out.println("Incorrect! Go higher.");                                         
                %>
            </p>            
        </h2>
            
        <h3> 
            <p>           
                               
                <%
                // Inform the user how many tries it has taken
                if ( guess.getNum() < guess.getGuess() || guess.getNum() > guess.getGuess()) 
                {
                    guess.arrayTries[guess.getTries()] = guess.getGuess();
                    guess.setTries(guess.getTries() + 1);   
                                                                       
                }
                
                out.println("Number of tries: " + guess.getTries());
                
                %>
            </p>
                   </h3>
            <h4>
            <p> 
                <% 
                     
                    
                    
                   if ( guess.getNum() < guess.getGuess() || guess.getNum() > guess.getGuess()) 
                {
                    for(int i = 0; i<guess.getTries(); i++){
                       
                        out.println(guess.arrayTries[i]);
                        
                        
                        
                    }
                    
                    
                                                   
                }
               
                    
                       
                       

                %>
            
            
            </p>
      
        </h4> 
           
        <p>
            <FORM METHOD="POST" ACTION="CalcGuess.jsp">
                Guess: <INPUT TYPE="TEXT" NAME="guess" SIZE="3" /><BR />        
                <p>
                    <input TYPE="SUBMIT" />
                </p>
            </FORM>
        </p>
        
        <p>
            <a href="GuessingGame.jsp">Start a new guessing game</a>
        </p>
    </body>
</html>
