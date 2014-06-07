HerokuSpringApp
===============

A spring based app deployed on heroku


1) heroku create
	this will create a heroku app, for more details go to https://dashboard.heroku.com/apps to see newly created app

2) git clone git@heroku.com:pure-peak-1324.git
	this will clone the empty project

3) git remote add heroku git@heroku.com:pure-peak-1324.git
	this will remote add the heroku

4) since i created a sample spring application, else you can create a maven project , for reference go to myapp2 to see sample

5) mvn build package
	thuis will build the project and to run it locally
   java -jar target/dependency/webapp-runner.jar target/*.war --port 8091
	and hit localhost:8091

6) do add, commit and issue 
	git push heroku master   
