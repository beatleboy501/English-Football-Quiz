<h1>English Football Quiz</h1>

<p>This Java web application can be used to give short quizzes which can be loaded from any text file. The default quiz is about English Football, seeing as I know so much about it.</p> :wink:
<br>
<br>
<p> The code consists of a simple Java back-end server which provides a REST API using Jackson to the AngularJS front-end client. All the code is bundled into a WAR file and can be served from an Apache Tomcat Server</p>
<hr>
<br>
<br>
<p>Try it out <a href="https://java-angular-football-quiz.herokuapp.com" target="_blank">here</a></p>
<br>

![ScreenShot](./screenshot.png)

<h2>How to Run Locally</h2>
1. Install Maven `brew install maven`
2. Run `mvn clean package`
3. If all goes well, you will have a `target` directory. Run
```java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port 8000 --session-store memcache target/*.war```
4. In your web browser visit `localhost:8000` to take the quiz