HerokuSpringApp
===============

A spring based app deployed on heroku


1) This will create a heroku app, for more details go to https://dashboard.heroku.com/apps to see newly created app
	<br>
	
	heroku create
	
	
2) This will clone the empty project
	<br>
	
	git clone git@heroku.com:pure-peak-1324.git



3) This will remote add the heroku
	<br>
	
	git remote add heroku git@heroku.com:pure-peak-1324.git



4) Since i created a sample spring application, else you can create a maven project , for reference go to myapp2 to see sample


5)thuis will build the project and to run it locally
	<br>

	mvn build package
   	java -jar target/dependency/webapp-runner.jar target/*.war --port 8091

and hit localhost:8091

6) do add, commit and issue 
	git push heroku master   
