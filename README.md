# Octane_Gherkin
This script is a simple script to demonstrate the ability to have Cucumber tests results be reported back to Octane (via Jenkins).  You will need to make sure to have the Jenkins [HPE Application Automation Tools 5.2](https://wiki.jenkins.io/display/JENKINS/HPE+Application+Automation+Tools) plug in installed to perform the steps below

## For use
You will need to decide if you want to store this script in your source code management tool and have your Jenkins job pull from it or you can have your Jenkins point directly at this project.

In Jenkins, you will need to create a Freestyle job and checkout the project from your git repo.  Either pull from your own (assuming you have put this project in your SCM) or you can point at this one like is shown in the image below.

![Jenkins Build Section](docImg/jenkinsScm.png?raw=true)

I suggest you use the following for your Maven goals

![Jenkins Build Section](docImg/jenkinsBuild.png?raw=true)

And enter the following for your Post Build actions 

##![Jenkins Post Build Section](docImg/jenkinsPostBuild2.png?raw=true)

**NOTE**

Publish JUnit test result report
* the file name shown above comes from the name used in the test project (src/test/java/net.hpe/TestRunner) class

HPE Octane Cucumber test reporter
* Generally speaking, you shouldn't need to enter anything.  The above is based on the use of the Jenkins [HPE Application Automation Tools 5.2](https://wiki.jenkins.io/display/JENKINS/HPE+Application+Automation+Tools)
