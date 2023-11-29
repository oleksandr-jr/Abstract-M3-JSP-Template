package org.javarush.m3fp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBase {
    private static QuestionsBase instance;
    private List<Question> questions;
    private int currentQuestionIndex = 0;

    private QuestionsBase() {
        questions = new ArrayList<>();

        questions.add(new Question("img/1.png",
                "Ubuntu",
                "Debian",
                "Linux",
                "Fedora", 3));

        questions.add(new Question( "img/2.png",
                "Java",
                "Jacobs",
                "Struts",
                "JavaScript", 1));

        questions.add(new Question( "img/3.png",
                "HTML",
                "HTTP",
                "Cisco",
                "CSS", 4));

        questions.add(new Question("img/4.png",
                "Delphi",
                "MySQL",
                "SuperSQL",
                "SQL Server", 2));

        questions.add(new Question( "img/5.png",
                "Slack",
                "Skype",
                "ICQ",
                "Google", 1));

        questions.add(new Question( "img/6.png",
                "Github",
                "Tomcat",
                "TigerJS",
                "MariaDB", 2));

        questions.add(new Question("img/7.png",
                "HTML",
                "JS",
                "SQL",
                "CSS", 1));

        questions.add(new Question("img/8.png",
                "GitLab",
                "CatStore",
                "Tomcat",
                "GitHub", 4));

        questions.add(new Question( "img/9.png",
                "TypeScript",
                "PHP",
                "Python",
                "Ubuntu", 3));

        questions.add(new Question( "img/10.png",
                "DiamondScript",
                "Node JS",
                "JavaScript",
                "JavaBeans", 2));
        questions.add(new Question( "img/11.png",
                "SpaceX",
                "Postman",
                "Spotify",
                "GitLab", 2));
        questions.add(new Question( "img/12.png",
                "WiFi",
                "JQuery",
                "Cisco",
                "MicroTik", 2));
        questions.add(new Question( "img/13.png",
                "OpenAI",
                "Bard",
                "Bing",
                "React", 4));
        questions.add(new Question( "img/14.png",
                "TensorFlow",
                "TeamSpeak",
                "Test Automation",
                "TypeScript", 4));
        questions.add(new Question( "img/15.png",
                "Spring",
                "ECO System",
                "OpenCart",
                "EcoFlow", 1));
        questions.add(new Question( "img/16.png",
                "IntelliJ IDEA",
                "Sublime Text",
                "VS Code",
                "FL Studio", 3));
        questions.add(new Question( "img/17.png",
                "Intel",
                "OpenAI",
                "Daily AI",
                "Bard", 2));
        questions.add(new Question( "img/18.png",
                "GitHub",
                "Git",
                "Gitlab",
                "Cherry AI", 2));
        questions.add(new Question( "img/19.png",
                "PHP",
                "PostgreSQL",
                "Gitlab",
                "Elephant IT", 2));
        questions.add(new Question( "img/20.png",
                "Adobe",
                "Agile",
                "Aida",
                "Angular", 4));
        questions.add(new Question( "img/JR.png",
                "Pascal",
                "Hibernate",
                "JavaRush",
                "Jira", 3));

        currentQuestionIndex = 0;
    }


    public static synchronized QuestionsBase getInstance() {
        if (instance == null) {
            instance = new QuestionsBase();
        }
        return instance;
    }

    public List<Question> getQuestions() {
        return questions;
    }

}
