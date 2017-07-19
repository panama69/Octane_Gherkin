# Octane_Gherkin
This script is a simple script to demonstrate the ability to have Cucumber tests results be reported back to Octane (via Jenkins).

In Jenkins, youw will need to create a Freestyle job and checkout the project from your git repo.

I suggest you use the following for your Maven goals

![Jenkins Build Section](docImg/jenkinsBuild.png?raw=true)

And enter the following for your Post Build actions (**NOTE** You MAY see the red messages, like below, because the files it is looking for do not exist until after the test is executed)

![Jenkins Post Build Section](docImg/jenkinsPostBuild1.png?raw=true)

After the test is executed, you should see the following when you look at the configuration


![Jenkins Post Build Section](docImg/jenkinsPostBuild2.png?raw=true)
