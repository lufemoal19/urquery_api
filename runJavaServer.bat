title "UrQuery grupo 03-1pm"
mvn compile clean install exec:java -Dexec.mainClass=urquery.api.ApiApplication
pause
start localhost:8080