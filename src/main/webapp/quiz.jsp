<%@ page import="org.javarush.m3fp.Question" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>IT LOGO QUIZ</title>
    <link rel="stylesheet" type="text/css" href="./static/style.css">
    <script type="text/javascript" src="script.js"></script>
</head>
<body>
<div class="container">
    <div class="quiz-header">
        <h1>IT LOGO QUIZ</h1>
    </div>

    <form id="quiz-form" action="/quiz" method="post" onsubmit="return validateForm();">
        <div class="quiz-question">
            <%
                Question currentQuestion = (Question) session.getAttribute("currentQuestion");
                String questionImage = currentQuestion.getQuestion();
            %>

            <c:if test="${not empty questionImage}">
                <div class="question-image-container">
                    <img src="<%= questionImage %>" alt="Зображення питання" class="question-image" width="200">
                </div>
            </c:if>
            <div class="quiz-info">Питання ${sessionScope.currentQuestionIndex + 1} з ${sessionScope.totalQuestions}</p></div>
        </div>
        <div class="quiz-options">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="userAnswer" value="1" id="option1">
                <label class="form-check-label" for="option1">${currentQuestion.getAnswerOption1()}</label><br>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="userAnswer" value="2" id="option2">
                <label class="form-check-label" for="option2">${currentQuestion.getAnswerOption2()}</label><br>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="userAnswer" value="3" id="option3">
                <label class="form-check-label" for="option3">${currentQuestion.getAnswerOption3()}</label><br>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="userAnswer" value="4" id="option4">
                <label class="form-check-label" for="option4">${currentQuestion.getAnswerOption4()}</label><br>
            </div>
        </div>

        <div class="quiz-submit">
            <input type="submit" class="btn" id="submit-button" value="Відправити" onclick="return validateSelection() && validateForm();" />

        </div>
        <div class="quiz-timer">
            <p>Час до завершення відповіді: <span id="timer"></span></p>
        </div>

        <div class="hidden-element" id="answer-alert" >
            ${message}
        </div>
        <div class="hidden-element" id="level" >
            ${sessionScope.level}
        </div>
    </form>

    <div class="quiz-timer-message">
        <p id="timer-message"></p>
    </div>

    <div class="quiz-restart">
        <button id="restart-button" onclick="restartGame();">Почати заново</button>
    </div>
    <div class="go-home">
        <button class="btn" onclick="goHome();">На головну</button>
    </div>
</div>
</body>
</html>
